package w95;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f444078a;

    /* renamed from: b, reason: collision with root package name */
    public final w95.a f444079b;

    public c(w95.a aVar) {
        this.f444079b = aVar;
    }

    public final void a(w95.d dVar) {
        java.net.HttpURLConnection httpURLConnection;
        java.lang.String scheme = dVar.f444081e.getScheme();
        if (scheme == null || !(scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            throw new x95.a(1105, "Can only download HTTP/HTTPS, uri = " + dVar.f444081e);
        }
        try {
            java.net.HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(dVar.f444081e.toString()).openConnection();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    httpURLConnection = null;
                }
            } catch (java.net.SocketTimeoutException unused) {
            } catch (java.io.IOException unused2) {
            }
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(((x95.c) dVar.h()).f452741a);
                httpURLConnection.setReadTimeout(((x95.c) dVar.h()).f452741a);
                java.util.HashMap hashMap = dVar.f444088o;
                if (hashMap != null) {
                    for (java.lang.String str : hashMap.keySet()) {
                        httpURLConnection.addRequestProperty(str, (java.lang.String) hashMap.get(str));
                    }
                }
                if (dVar.f444082f.exists()) {
                    dVar.f444086m = 0L;
                    java.io.File file = dVar.f444082f;
                    if (file != null) {
                        file.delete();
                    }
                }
                dVar.f444080d = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION;
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200 || responseCode == 206) {
                    if (!c(dVar, httpURLConnection)) {
                        throw new x95.a(1104, "Transfer-Encoding not found as well as can't know size of download, giving up");
                    }
                    e(dVar, httpURLConnection);
                } else {
                    if (responseCode != 307) {
                        if (responseCode == 404 || responseCode == 416 || responseCode == 500 || responseCode == 503) {
                            throw new x95.a(responseCode, httpURLConnection.getResponseMessage());
                        }
                        switch (responseCode) {
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                throw new x95.a(1101, "Unhandled HTTP response:" + responseCode + " message:" + httpURLConnection.getResponseMessage());
                        }
                    }
                    if (dVar.f444085i >= 5) {
                        throw new x95.a(1103, "too many redirects, redirect count = " + dVar.f444085i);
                    }
                    dVar.f444081e = android.net.Uri.parse(httpURLConnection.getHeaderField("Location"));
                    dVar.f444085i++;
                    dVar.f444080d = 2030;
                }
                httpURLConnection.disconnect();
            } catch (java.net.SocketTimeoutException unused3) {
                httpURLConnection2 = httpURLConnection;
                x95.c cVar = (x95.c) dVar.h();
                int i17 = cVar.f452742b + 1;
                cVar.f452742b = i17;
                float f17 = cVar.f452741a;
                cVar.f452741a = (int) (f17 + (1.0f * f17));
                if (!(i17 < 3)) {
                    throw new x95.a(1106, "Connection time out after maximum retires attempted");
                }
                dVar.f444080d = 2030;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (java.io.IOException unused4) {
                throw new x95.a(1102, "Trouble with low-level socket errors");
            } catch (java.lang.Throwable th7) {
                th = th7;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.net.MalformedURLException unused5) {
            throw new x95.a(1105, "URI is malformed.");
        }
    }

    public void b(w95.d dVar) {
        android.content.Context context = this.f444078a;
        w95.b bVar = new w95.b();
        if (context != null && b3.l.checkSelfPermission(context, "android.permission.WAKE_LOCK") == 0) {
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "downloader");
            bVar.f444076a = newWakeLock;
            if (!newWakeLock.isHeld()) {
                bVar.f444076a.setWorkSource(new android.os.WorkSource());
                android.os.PowerManager.WakeLock wakeLock = bVar.f444076a;
                yj0.a.c(wakeLock, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "lock", "(Landroid/content/Context;)Lcom/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock.acquire();
                yj0.a.f(wakeLock, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "lock", "(Landroid/content/Context;)Lcom/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            }
            android.net.wifi.WifiManager.WifiLock createWifiLock = ((android.net.wifi.WifiManager) context.getSystemService("wifi")).createWifiLock("WIFI LOCK : downloader");
            bVar.f444077b = createWifiLock;
            if (!createWifiLock.isHeld()) {
                bVar.f444077b.acquire();
            }
        }
        do {
            try {
                try {
                    dVar.f444080d = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC;
                    a(dVar);
                } catch (x95.a e17) {
                    int i17 = e17.f452740d;
                    java.lang.String localizedMessage = e17.getLocalizedMessage();
                    dVar.f444080d = 2040;
                    java.io.File file = dVar.f444083g;
                    if (file != null) {
                        file.delete();
                    }
                    java.io.File file2 = dVar.f444082f;
                    if (file2 != null) {
                        file2.delete();
                    }
                    this.f444079b.b(dVar, i17, localizedMessage);
                }
            } catch (java.lang.Throwable th6) {
                bVar.a();
                throw th6;
            }
        } while (dVar.f444080d == 2060);
        bVar.a();
    }

    public final boolean c(w95.d dVar, java.net.HttpURLConnection httpURLConnection) {
        long j17;
        if (dVar.f444087n != -1) {
            return true;
        }
        java.lang.String headerField = httpURLConnection.getHeaderField("Transfer-Encoding");
        if (headerField != null && headerField.equalsIgnoreCase("chunked")) {
            return true;
        }
        try {
            j17 = java.lang.Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
            try {
                dVar.f444087n = dVar.f444086m + j17;
            } catch (java.lang.NumberFormatException unused) {
            }
        } catch (java.lang.NumberFormatException unused2) {
            j17 = -1;
        }
        return j17 != -1;
    }

    public final void d(w95.d dVar, java.io.InputStream inputStream, java.io.OutputStream outputStream, java.io.FileDescriptor fileDescriptor) {
        int i17;
        dVar.f444080d = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE;
        byte[] bArr = new byte[4096];
        long j17 = dVar.f444087n;
        long j18 = 0;
        while (!dVar.f444084h) {
            try {
                i17 = inputStream.read(bArr);
            } catch (java.io.IOException e17) {
                i17 = "unexpected end of stream".equals(e17.getMessage()) ? -1 : Integer.MIN_VALUE;
            }
            long j19 = dVar.f444086m;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j27 = currentTimeMillis - j18;
            w95.a aVar = this.f444079b;
            if (j27 > 1000) {
                if (j17 != -1 && j17 > 0) {
                    long j28 = (100 * j19) / j17;
                    aVar.getClass();
                    if (dVar.f444091r != null) {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                }
                j18 = currentTimeMillis;
            }
            if (i17 == -1) {
                dVar.f444080d = 2020;
                try {
                    if (!dVar.f444082f.renameTo(dVar.f444083g)) {
                        throw new x95.a(1001, "Cannot rename intermediate file to dest file!");
                    }
                    dVar.i();
                    aVar.a(dVar);
                    return;
                } catch (x95.a e18) {
                    throw new x95.a(e18.f452740d, e18.getLocalizedMessage());
                }
            }
            if (i17 == Integer.MIN_VALUE) {
                throw new x95.a(1102, "Failed reading http response");
            }
            boolean z17 = false;
            if (fileDescriptor.valid()) {
                try {
                    outputStream.write(bArr, 0, i17);
                    outputStream.flush();
                    fileDescriptor.sync();
                    z17 = true;
                } catch (java.io.IOException unused) {
                }
            }
            if (!z17) {
                throw new x95.a(1001, "Failed writing file");
            }
            dVar.f444086m = j19 + i17;
        }
        throw new x95.a(com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "Download cancelled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void e(w95.d dVar, java.net.HttpURLConnection httpURLConnection) {
        boolean z17;
        ?? r37;
        java.io.File file = new java.io.File(dVar.f444082f.getPath());
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            z17 = file.createNewFile();
        } catch (java.io.IOException unused) {
            z17 = false;
        }
        if (!z17) {
            throw new x95.a(1001, "Error in creating prepare file");
        }
        java.io.OutputStream outputStream = null;
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            try {
                r37 = new java.io.FileOutputStream(file, true);
            } catch (java.io.IOException unused2) {
                r37 = outputStream;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r37 = outputStream;
            }
            try {
                java.io.FileDescriptor fd6 = r37.getFD();
                outputStream = new java.io.BufferedOutputStream(r37);
                d(dVar, inputStream, outputStream, fd6);
                w95.f.a(inputStream);
                w95.f.a(outputStream);
            } catch (java.io.IOException unused3) {
                outputStream = inputStream;
                r37 = r37;
                try {
                    if (outputStream != null) {
                        throw new x95.a(1001, "Error in writing download contents to the destination file");
                    }
                    throw new x95.a(1102, "Error in creating input stream");
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    w95.f.a(outputStream);
                    w95.f.a(r37);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                outputStream = inputStream;
                w95.f.a(outputStream);
                w95.f.a(r37);
                throw th;
            }
        } catch (java.io.IOException unused4) {
            r37 = 0;
        } catch (java.lang.Throwable th9) {
            th = th9;
            r37 = 0;
        }
    }
}
