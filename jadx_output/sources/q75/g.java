package q75;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f360610a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f360611b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("silk", "audio/silk"));
        arrayList.add(new android.util.Pair("jpg", "image/jpeg"));
        arrayList.add(new android.util.Pair("json", "application/json"));
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            hashMap.put((java.lang.String) pair.first, (java.lang.String) pair.second);
            hashMap2.put((java.lang.String) pair.second, (java.lang.String) pair.first);
        }
        f360610a = java.util.Collections.unmodifiableMap(hashMap);
        f360611b = java.util.Collections.unmodifiableMap(hashMap2);
    }

    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String lowerCase = str.toLowerCase();
        java.lang.String str2 = (java.lang.String) f360611b.get(lowerCase);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG.equals(lowerCase) || "audio/mp3".equals(lowerCase)) {
                return "mp3";
            }
            if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MP4.equals(lowerCase)) {
                return "mp4";
            }
            if ("application/pdf".equals(lowerCase)) {
                return "pdf";
            }
            if ("image/jpeg".equals(lowerCase) || "image/jpg".equals(lowerCase)) {
                return "jpg";
            }
            if ("image/gif".equals(lowerCase)) {
                return "gif";
            }
        }
        return str2;
    }

    public static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) f360610a.get(str.toLowerCase());
        if (android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str)) {
            str2 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return (android.text.TextUtils.isEmpty(str2) && "mp3".equals(str)) ? com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG : str2;
    }

    public static java.lang.String c(java.lang.String str) {
        int lastIndexOf;
        java.lang.String str2 = null;
        if (!android.text.TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) >= 0 && lastIndexOf < str.length() - 1) {
            str2 = str.substring(lastIndexOf + 1);
        }
        return b(str2);
    }

    public static java.lang.String d(java.lang.String str) {
        try {
            return q75.f.a(new androidx.exifinterface.media.ExifInterface(str), str);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MimeTypeUtil", e17, "readExifErr", new java.lang.Object[0]);
            if (android.os.Build.VERSION.SDK_INT < 29) {
                return null;
            }
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
                    mediaMetadataRetriever.release();
                    return extractMetadata;
                } finally {
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MimeTypeUtil", e18, "readMetaDataErr", new java.lang.Object[0]);
                return null;
            }
        }
    }
}
