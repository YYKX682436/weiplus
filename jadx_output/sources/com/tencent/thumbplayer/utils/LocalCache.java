package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class LocalCache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static java.util.Map<java.lang.String, com.tencent.thumbplayer.utils.LocalCache> mInstanceMap = new java.util.HashMap();
    private com.tencent.thumbplayer.utils.LocalCache.ACacheManager mCache;

    /* loaded from: classes13.dex */
    public static class ACacheManager {
        private final java.util.concurrent.atomic.AtomicInteger cacheCount;
        protected java.io.File cacheDir;
        private final java.util.concurrent.atomic.AtomicLong cacheSize;
        private final int countLimit;
        private final java.util.Map<java.io.File, java.lang.Long> lastUsageDates;
        private final long sizeLimit;

        private void calculateCacheSizeAndCacheCount() {
            com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.utils.LocalCache.ACacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    java.io.File[] listFiles = com.tencent.thumbplayer.utils.LocalCache.ACacheManager.this.cacheDir.listFiles();
                    if (listFiles != null) {
                        int i17 = 0;
                        int i18 = 0;
                        for (java.io.File file : listFiles) {
                            i17 = (int) (i17 + com.tencent.thumbplayer.utils.LocalCache.ACacheManager.this.calculateSize(file));
                            i18++;
                            com.tencent.thumbplayer.utils.LocalCache.ACacheManager.this.lastUsageDates.put(file, java.lang.Long.valueOf(file.lastModified()));
                        }
                        com.tencent.thumbplayer.utils.LocalCache.ACacheManager.this.cacheSize.set(i17);
                        com.tencent.thumbplayer.utils.LocalCache.ACacheManager.this.cacheCount.set(i18);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long calculateSize(java.io.File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.lastUsageDates.clear();
            this.cacheSize.set(0L);
            this.cacheCount.set(0);
            java.io.File[] listFiles = this.cacheDir.listFiles();
            if (listFiles != null) {
                for (java.io.File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.io.File get(java.lang.String str) {
            java.io.File newFile = newFile(str);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            newFile.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(newFile, valueOf);
            return newFile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.io.File newFile(java.lang.String str) {
            return new java.io.File(this.cacheDir, str.hashCode() + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(java.io.File file) {
            int i17 = this.cacheCount.get();
            while (i17 + 1 > this.countLimit) {
                this.cacheSize.addAndGet(-removeNext());
                i17 = this.cacheCount.addAndGet(-1);
            }
            this.cacheCount.addAndGet(1);
            long calculateSize = calculateSize(file);
            long j17 = this.cacheSize.get();
            while (j17 + calculateSize > this.sizeLimit) {
                j17 = this.cacheSize.addAndGet(-removeNext());
            }
            this.cacheSize.addAndGet(calculateSize);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(file, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean remove(java.lang.String str) {
            java.io.File file = get(str);
            long calculateSize = calculateSize(file);
            if (!file.delete()) {
                return false;
            }
            this.cacheCount.addAndGet(-1);
            this.cacheSize.addAndGet(-calculateSize);
            return true;
        }

        private long removeNext() {
            java.io.File file;
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            java.util.Set<java.util.Map.Entry<java.io.File, java.lang.Long>> entrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
                file = null;
                java.lang.Long l17 = null;
                for (java.util.Map.Entry<java.io.File, java.lang.Long> entry : entrySet) {
                    if (file == null) {
                        file = entry.getKey();
                        l17 = entry.getValue();
                    } else {
                        java.lang.Long value = entry.getValue();
                        if (value.longValue() < l17.longValue()) {
                            file = entry.getKey();
                            l17 = value;
                        }
                    }
                }
            }
            if (file == null) {
                return 0L;
            }
            long calculateSize = calculateSize(file);
            if (file.delete()) {
                this.lastUsageDates.remove(file);
            }
            return calculateSize;
        }

        private ACacheManager(java.io.File file, long j17, int i17) {
            this.lastUsageDates = java.util.Collections.synchronizedMap(new java.util.HashMap());
            this.cacheDir = file;
            this.sizeLimit = j17;
            this.countLimit = i17;
            this.cacheSize = new java.util.concurrent.atomic.AtomicLong();
            this.cacheCount = new java.util.concurrent.atomic.AtomicInteger();
            calculateCacheSizeAndCacheCount();
        }
    }

    /* loaded from: classes13.dex */
    public static class Utils {
        private static final char mSeparator = ' ';
        private byte _hellAccFlag_;

        private Utils() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] Bitmap2Bytes(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static android.graphics.Bitmap Bytes2Bimap(byte[] bArr) {
            int length = bArr.length;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static android.graphics.drawable.Drawable bitmap2Drawable(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            return new android.graphics.drawable.BitmapDrawable(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String clearDateInfo(java.lang.String str) {
            return (str == null || !hasDateInfo(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static byte[] copyOfRange(byte[] bArr, int i17, int i18) {
            int i19 = i18 - i17;
            if (i19 >= 0) {
                byte[] bArr2 = new byte[i19];
                java.lang.System.arraycopy(bArr, i17, bArr2, 0, java.lang.Math.min(bArr.length - i17, i19));
                return bArr2;
            }
            throw new java.lang.IllegalArgumentException(i17 + " > " + i18);
        }

        private static java.lang.String createDateInfo(int i17) {
            java.lang.String str = java.lang.System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0".concat(str);
            }
            return str + "-" + i17 + mSeparator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static android.graphics.Bitmap drawable2Bitmap(android.graphics.drawable.Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            android.graphics.Bitmap.Config config = drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
            arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/utils/LocalCache$Utils", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/thumbplayer/utils/LocalCache$Utils", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        }

        private static java.lang.String[] getDateInfoFromDate(byte[] bArr) {
            if (hasDateInfo(bArr)) {
                return new java.lang.String[]{new java.lang.String(copyOfRange(bArr, 0, 13)), new java.lang.String(copyOfRange(bArr, 14, indexOf(bArr, mSeparator)))};
            }
            return null;
        }

        private static boolean hasDateInfo(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && indexOf(bArr, mSeparator) > 14;
        }

        private static int indexOf(byte[] bArr, char c17) {
            for (int i17 = 0; i17 < bArr.length; i17++) {
                if (bArr[i17] == c17) {
                    return i17;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(java.lang.String str) {
            return isDue(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithDateInfo(int i17, byte[] bArr) {
            byte[] bytes = createDateInfo(i17).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            java.lang.System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            java.lang.System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String newStringWithDateInfo(int i17, java.lang.String str) {
            return createDateInfo(i17) + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            java.lang.String[] dateInfoFromDate = getDateInfoFromDate(bArr);
            if (dateInfoFromDate != null && dateInfoFromDate.length == 2) {
                java.lang.String str = dateInfoFromDate[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                try {
                    if (java.lang.System.currentTimeMillis() > java.lang.Long.valueOf(str).longValue() + (java.lang.Long.valueOf(dateInfoFromDate[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] clearDateInfo(byte[] bArr) {
            return hasDateInfo(bArr) ? copyOfRange(bArr, indexOf(bArr, mSeparator) + 1, bArr.length) : bArr;
        }
    }

    private LocalCache(java.io.File file, long j17, int i17) {
        if (file.exists() || file.mkdirs()) {
            this.mCache = new com.tencent.thumbplayer.utils.LocalCache.ACacheManager(file, j17, i17);
        } else {
            this.mCache = null;
        }
    }

    public static com.tencent.thumbplayer.utils.LocalCache get(android.content.Context context) {
        return get(context, "LocalCache");
    }

    private static java.lang.String myPid() {
        return "_" + android.os.Process.myPid();
    }

    public void clear() {
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        aCacheManager.clear();
    }

    public java.io.File file(java.lang.String str) {
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return null;
        }
        java.io.File newFile = aCacheManager.newFile(str);
        if (newFile.exists()) {
            return newFile;
        }
        return null;
    }

    public byte[] getAsBinary(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        java.io.RandomAccessFile randomAccessFile2 = null;
        if (aCacheManager == null) {
            return null;
        }
        try {
            java.io.File file = aCacheManager.get(str);
            if (!file.exists()) {
                return null;
            }
            randomAccessFile = new java.io.RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                if (randomAccessFile.read(bArr) <= 0) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused) {
                    }
                    return null;
                }
                if (com.tencent.thumbplayer.utils.LocalCache.Utils.isDue(bArr)) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused2) {
                    }
                    remove(str);
                    return null;
                }
                byte[] clearDateInfo = com.tencent.thumbplayer.utils.LocalCache.Utils.clearDateInfo(bArr);
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused3) {
                }
                return clearDateInfo;
            } catch (java.lang.Exception unused4) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused7) {
            randomAccessFile = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public android.graphics.Bitmap getAsBitmap(java.lang.String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return com.tencent.thumbplayer.utils.LocalCache.Utils.Bytes2Bimap(getAsBinary(str));
    }

    public android.graphics.drawable.Drawable getAsDrawable(java.lang.String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return com.tencent.thumbplayer.utils.LocalCache.Utils.bitmap2Drawable(com.tencent.thumbplayer.utils.LocalCache.Utils.Bytes2Bimap(getAsBinary(str)));
    }

    public org.json.JSONArray getAsJSONArray(java.lang.String str) {
        try {
            return new org.json.JSONArray(getAsString(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public org.json.JSONObject getAsJSONObject(java.lang.String str) {
        try {
            return new org.json.JSONObject(getAsString(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.Object getAsObject(java.lang.String str) {
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.lang.Throwable th6;
        java.io.ObjectInputStream objectInputStream;
        byte[] asBinary = getAsBinary(str);
        if (asBinary != null) {
            try {
                byteArrayInputStream = new java.io.ByteArrayInputStream(asBinary);
                try {
                    objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        java.lang.Object readObject = objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                        return readObject;
                    } catch (java.lang.Exception unused3) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        return null;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.io.IOException unused6) {
                            }
                        }
                        if (objectInputStream == null) {
                            throw th6;
                        }
                        try {
                            objectInputStream.close();
                            throw th6;
                        } catch (java.io.IOException unused7) {
                            throw th6;
                        }
                    }
                } catch (java.lang.Exception unused8) {
                    objectInputStream = null;
                } catch (java.lang.Throwable th8) {
                    th6 = th8;
                    objectInputStream = null;
                }
            } catch (java.lang.Exception unused9) {
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (java.lang.Throwable th9) {
                byteArrayInputStream = null;
                th6 = th9;
                objectInputStream = null;
            }
        }
        return null;
    }

    public java.lang.String getAsString(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        java.io.BufferedReader bufferedReader2 = null;
        if (aCacheManager == null) {
            return null;
        }
        java.io.File file = aCacheManager.get(str);
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            java.lang.String str2 = "";
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                } catch (java.io.IOException unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (com.tencent.thumbplayer.utils.LocalCache.Utils.isDue(str2)) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
                remove(str);
                return null;
            }
            java.lang.String clearDateInfo = com.tencent.thumbplayer.utils.LocalCache.Utils.clearDateInfo(str2);
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused5) {
            }
            return clearDateInfo;
        } catch (java.io.IOException unused6) {
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public void put(java.lang.String str, java.lang.String str2) {
        java.io.BufferedWriter bufferedWriter;
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        java.io.File newFile = aCacheManager.newFile(str);
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(newFile), 1024);
            } catch (java.io.IOException unused) {
                this.mCache.put(newFile);
            }
            try {
                bufferedWriter.write(str2);
                try {
                    bufferedWriter.flush();
                } catch (java.io.IOException unused2) {
                }
                bufferedWriter.close();
            } catch (java.io.IOException unused3) {
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.flush();
                    } catch (java.io.IOException unused4) {
                    }
                    bufferedWriter2.close();
                }
                this.mCache.put(newFile);
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.flush();
                    } catch (java.io.IOException unused5) {
                    }
                    try {
                        bufferedWriter2.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                this.mCache.put(newFile);
                throw th;
            }
        } catch (java.io.IOException unused7) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public boolean remove(java.lang.String str) {
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return false;
        }
        return aCacheManager.remove(str);
    }

    public static com.tencent.thumbplayer.utils.LocalCache get(android.content.Context context, java.lang.String str) {
        return get(new java.io.File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static com.tencent.thumbplayer.utils.LocalCache get(java.io.File file) {
        return get(file, 50000000L, Integer.MAX_VALUE);
    }

    public static com.tencent.thumbplayer.utils.LocalCache get(android.content.Context context, long j17, int i17) {
        return get(new java.io.File(context.getCacheDir(), "LocalCache"), j17, i17);
    }

    public static com.tencent.thumbplayer.utils.LocalCache get(java.io.File file, long j17, int i17) {
        com.tencent.thumbplayer.utils.LocalCache localCache;
        try {
            localCache = mInstanceMap.get(file.getAbsoluteFile() + myPid());
        } catch (java.lang.Exception unused) {
            localCache = null;
        }
        if (localCache != null) {
            return localCache;
        }
        try {
            com.tencent.thumbplayer.utils.LocalCache localCache2 = new com.tencent.thumbplayer.utils.LocalCache(file, j17, i17);
            try {
                mInstanceMap.put(file.getAbsolutePath() + myPid(), localCache2);
            } catch (java.lang.Throwable unused2) {
            }
            return localCache2;
        } catch (java.lang.Throwable unused3) {
            return localCache;
        }
    }

    public void put(java.lang.String str, java.lang.String str2, int i17) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.newStringWithDateInfo(i17, str2));
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        put(str, jSONObject.toString());
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject, int i17) {
        put(str, jSONObject.toString(), i17);
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray) {
        put(str, jSONArray.toString());
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray, int i17) {
        put(str, jSONArray.toString(), i17);
    }

    public void put(java.lang.String str, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        com.tencent.thumbplayer.utils.LocalCache.ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        java.io.File newFile = aCacheManager.newFile(str);
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(newFile);
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.lang.Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            this.mCache.put(newFile);
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (java.io.IOException unused4) {
                }
            }
            this.mCache.put(newFile);
            throw th;
        }
        this.mCache.put(newFile);
    }

    public void put(java.lang.String str, byte[] bArr, int i17) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.newByteArrayWithDateInfo(i17, bArr));
    }

    public void put(java.lang.String str, java.io.Serializable serializable) {
        put(str, serializable, -1);
    }

    public void put(java.lang.String str, java.io.Serializable serializable, int i17) {
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (i17 != -1) {
                        put(str, byteArray, i17);
                    } else {
                        put(str, byteArray);
                    }
                    objectOutputStream2.close();
                } catch (java.lang.Exception unused) {
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream == null) {
                        return;
                    }
                    objectOutputStream.close();
                } catch (java.lang.Throwable unused2) {
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream == null) {
                        return;
                    }
                    objectOutputStream.close();
                }
            } catch (java.lang.Throwable unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable unused5) {
        }
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.Bitmap2Bytes(bitmap));
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap, int i17) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.Bitmap2Bytes(bitmap), i17);
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.drawable2Bitmap(drawable));
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i17) {
        put(str, com.tencent.thumbplayer.utils.LocalCache.Utils.drawable2Bitmap(drawable), i17);
    }
}
