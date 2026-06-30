package h36;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final h36.h f278578a;

    /* renamed from: b, reason: collision with root package name */
    public final h36.i f278579b;

    /* renamed from: c, reason: collision with root package name */
    public final h36.g f278580c;

    /* renamed from: d, reason: collision with root package name */
    public h36.f f278581d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f278582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f278584g;

    public d(android.content.Context context, int i17) {
        byte[] bArr;
        int i18;
        byte[] bArr2;
        boolean z17;
        android.content.pm.Signature signature;
        byte[] bArr3 = null;
        h36.h hVar = new h36.h(null);
        this.f278578a = hVar;
        this.f278579b = new h36.i(hVar);
        this.f278580c = new h36.g(hVar);
        this.f278581d = null;
        this.f278583f = 66560;
        this.f278584g = 1404;
        this.f278582e = context;
        hVar.f278604j = context;
        hVar.f278603i = i17;
        hVar.f278620z = new h36.e(context);
        byte[] bArr4 = new byte[16];
        hVar.f278595a.nextBytes(bArr4);
        boolean z18 = false;
        java.lang.System.arraycopy(bArr4, 0, hVar.f278597c, 0, 16);
        synchronized (this) {
            byte[] p17 = oicq.wlogin_sdk.tools.util.p(context);
            if (p17.length <= 0) {
                p17 = oicq.wlogin_sdk.tools.util.j(context);
                if (p17 != null && p17.length > 0) {
                    hVar.f278614t = 1;
                    oicq.wlogin_sdk.tools.util.w(context, p17);
                    hVar.f278613s = 1;
                    hVar.f278615u = 1;
                }
                p17 = new java.lang.String("%4;7t>;28<fc.5*6").getBytes();
                hVar.f278614t = 0;
                oicq.wlogin_sdk.tools.util.w(context, p17);
                hVar.f278613s = 1;
                hVar.f278615u = 1;
            } else {
                hVar.f278614t = 1;
                hVar.f278613s = 0;
                hVar.f278615u = 0;
            }
            g(p17);
            h36.h.A = (byte[]) hVar.f278605k.clone();
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                bArr = telephonyManager.getSimState() == 5 ? telephonyManager.getSimOperatorName().getBytes() : new byte[0];
            } catch (java.lang.Throwable unused) {
                bArr = new byte[0];
            }
            hVar.f278606l = bArr;
            int i19 = this.f278582e.getSharedPreferences("WLOGIN_SERVER_INFO", 0).getInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE, 0);
            h36.h hVar2 = this.f278578a;
            try {
                i18 = ((android.net.ConnectivityManager) this.f278582e.getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (java.lang.Exception unused2) {
                i18 = 0;
            }
            hVar2.f278607m = i18 != 0 ? i18 == 1 ? 2 : 0 : 1;
            if (i19 != this.f278578a.f278607m) {
                android.content.SharedPreferences.Editor edit = this.f278582e.getSharedPreferences("WLOGIN_NET_RETRY_TYPE", 0).edit();
                edit.putInt("type", 0);
                edit.commit();
                android.content.Context context2 = this.f278582e;
                int i27 = this.f278578a.f278607m;
                android.content.SharedPreferences.Editor edit2 = context2.getSharedPreferences("WLOGIN_SERVER_INFO", 0).edit();
                edit2.putInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE, i27);
                edit2.commit();
            }
            h36.h hVar3 = this.f278578a;
            java.lang.String str = "wifi";
            try {
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.f278582e.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo.getType() == 0) {
                    java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo != null) {
                        str = extraInfo;
                    }
                }
            } catch (java.lang.Exception unused3) {
            }
            hVar3.f278609o = str.getBytes();
            this.f278578a.f278616v = oicq.wlogin_sdk.tools.util.m(this.f278582e);
            this.f278578a.f278608n = this.f278582e.getPackageName().getBytes();
            h36.h hVar4 = this.f278578a;
            try {
                bArr2 = this.f278582e.getPackageManager().getPackageInfo(new java.lang.String(hVar4.f278608n), 0).versionName.getBytes();
            } catch (java.lang.Exception unused4) {
                bArr2 = new byte[0];
            }
            hVar4.f278610p = bArr2;
            h36.h hVar5 = this.f278578a;
            try {
                android.content.pm.Signature[] signatureArr = this.f278582e.getPackageManager().getPackageInfo(new java.lang.String(hVar5.f278608n), 64).signatures;
                if (signatureArr != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                    bArr3 = k36.d.k(signature.toByteArray());
                }
            } catch (java.lang.Throwable unused5) {
                bArr3 = new byte[0];
            }
            hVar5.f278611q = bArr3;
            java.lang.String str2 = android.os.Build.MODEL;
            if (str2 == null) {
                this.f278578a.f278612r = new byte[0];
            } else {
                this.f278578a.f278612r = str2.getBytes();
            }
            try {
                z17 = new java.io.File("/system/bin/su").exists();
            } catch (java.lang.Exception unused6) {
                z17 = false;
            }
            if (!z17) {
                try {
                    z18 = new java.io.File("/system/xbin/su").exists();
                } catch (java.lang.Exception unused7) {
                }
                if (!z18) {
                    try {
                        new java.io.File("/sbin/su").exists();
                    } catch (java.lang.Exception unused8) {
                    }
                }
            }
            this.f278578a.getClass();
            java.lang.String str3 = android.os.Build.VERSION.RELEASE;
            oicq.wlogin_sdk.tools.util.c("WtloginHelper init ok: curi:" + p17 + "android version:" + (str3 == null ? "" : str3) + " release time:" + new java.lang.String("2026/01/12 19:09"));
        }
    }

    public byte[] a(long j17, byte[] bArr) {
        byte[] g17;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        oicq.wlogin_sdk.tools.util.c("user:" + j17 + " CheckPicture ...");
        synchronized (this) {
            h36.g gVar = this.f278580c;
            this.f278581d = gVar;
            g17 = gVar.g(bArr);
        }
        oicq.wlogin_sdk.tools.util.c("user:" + j17 + " CheckPicture end");
        return g17;
    }

    public void b(long j17) {
        java.util.TreeMap l17;
        oicq.wlogin_sdk.tools.util.c("user:" + j17 + " ClearUserSigInfo");
        h36.h hVar = this.f278578a;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        synchronized (hVar) {
            h36.e eVar = hVar.f278620z;
            synchronized (eVar) {
                try {
                    eVar.f278586b.remove(valueOf);
                    android.content.Context context = eVar.f278585a;
                    if (context != null && (l17 = eVar.l(context, "tk_file")) != null) {
                        l17.remove(valueOf);
                        synchronized (eVar) {
                            if ("tk_file" == "tk_file") {
                                eVar.p(l17, "tk_file");
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public byte[] c(long j17, long j18) {
        byte[] bArr;
        oicq.wlogin_sdk.sharemem.WloginSigInfo a17 = this.f278578a.a(j17, j18);
        if (a17 == null || (bArr = a17._en_A1) == null || bArr.length <= 0) {
            oicq.wlogin_sdk.tools.util.c("userAccount:" + j17 + " appid:" + j18 + " GetA1ByAccount return: null");
            return null;
        }
        oicq.wlogin_sdk.tools.util.c("userAccount:" + j17 + " appid:" + j18 + " GetA1ByAccount return: not null");
        return (byte[]) a17._en_A1.clone();
    }

    public byte[] d(long j17) {
        int i17;
        byte[] bArr;
        synchronized (this) {
            j36.e eVar = this.f278578a.f278599e;
            i17 = eVar.f297529f;
            bArr = new byte[i17];
            if (i17 > 0) {
                java.lang.System.arraycopy(eVar.f297539d, eVar.f297531h, bArr, 0, i17);
            }
        }
        oicq.wlogin_sdk.tools.util.c("user:" + j17 + " GetPicture data len:" + i17);
        return bArr;
    }

    public byte[] e(long j17, long j18, int i17, h36.c cVar, java.lang.String str) {
        byte[] bytes;
        byte[] f17;
        byte[] bArr;
        boolean z17;
        int i18;
        byte[] h17;
        java.lang.String str2 = str;
        oicq.wlogin_sdk.tools.util.c("wtlogin login with GetStWithPasswd:user:" + j17 + " appid:" + j18 + " dwSigMap:" + i17 + " ...");
        if (str2 != null && str.length() > 16) {
            str2 = str2.substring(0, 16);
        }
        synchronized (this) {
            int i19 = h36.b.f278574a[cVar.ordinal()];
            int i27 = 2;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        return null;
                    }
                    byte[] c17 = c(j17, j18);
                    if (c17 != null && c17.length >= 16) {
                        bArr = c17;
                        z17 = true;
                    }
                    oicq.wlogin_sdk.tools.util.c("USER_WITH_A1 tmp_pwd null");
                    return null;
                }
                if (str2 == null || str2.length() == 0) {
                    oicq.wlogin_sdk.tools.util.c("USER_WITH_MD5 userPasswd null");
                    return null;
                }
                try {
                    f17 = (byte[]) str2.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET).clone();
                    bArr = f17;
                    z17 = false;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                if (str2 == null || str2.length() == 0) {
                    oicq.wlogin_sdk.tools.util.c("USER_WITH_PWD userPasswd null");
                    return null;
                }
                try {
                    bytes = str2.getBytes("ISO8859_1");
                } catch (java.io.UnsupportedEncodingException unused2) {
                    bytes = str2.getBytes();
                }
                f17 = new k36.d().f(bytes);
                bArr = f17;
                z17 = false;
            }
            h36.h hVar = this.f278578a;
            try {
                i18 = ((android.net.ConnectivityManager) this.f278582e.getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (java.lang.Exception unused3) {
                i18 = 0;
            }
            if (i18 == 0) {
                i27 = 1;
            } else if (i18 != 1) {
                i27 = 0;
            }
            hVar.f278607m = i27;
            h36.h hVar2 = this.f278578a;
            java.lang.String str3 = "wifi";
            try {
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.f278582e.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo.getType() == 0) {
                    java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo != null) {
                        str3 = extraInfo;
                    }
                }
            } catch (java.lang.Exception unused4) {
            }
            hVar2.f278609o = str3.getBytes();
            h36.h hVar3 = this.f278578a;
            hVar3.f278600f = j17;
            hVar3.f278601g = j18;
            hVar3.f278598d = new j36.d();
            h36.i iVar = this.f278579b;
            this.f278581d = iVar;
            if (z17) {
                h17 = iVar.g(j18, 1, j17, 0, hVar3.f278619y, bArr, this.f278584g, this.f278583f, null, i17, 1L, 1, 0, 1, 102400, 1, hVar3.f278616v);
            } else {
                byte[] bArr2 = new byte[4];
                oicq.wlogin_sdk.tools.util.t(bArr2, 0, java.lang.System.currentTimeMillis() / 1000);
                h36.i iVar2 = this.f278579b;
                h36.h hVar4 = this.f278578a;
                h17 = iVar2.h(j18, 1, j17, 0, hVar4.f278619y, bArr2, 0, bArr, this.f278584g, this.f278583f, null, i17, 1L, 1, 0, 1, 102400, 1, hVar4.f278616v);
            }
            oicq.wlogin_sdk.tools.util.c("wtlogin login with GetStWithPasswd:user:" + j17 + " appid:" + j18 + " dwSigMap:" + i17 + " end");
            return h17;
        }
    }

    public int f(byte[] bArr) {
        int i17;
        if (bArr == null || bArr.length == 0 || this.f278581d == null) {
            return -1017;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("user:");
        h36.h hVar = this.f278578a;
        sb6.append(hVar.f278600f);
        sb6.append(" ResolveSvrData ...");
        oicq.wlogin_sdk.tools.util.c(sb6.toString());
        h36.f fVar = this.f278581d;
        int length = bArr.length;
        if (length <= 17) {
            fVar.getClass();
            i17 = -1009;
        } else {
            fVar.f278590c = (length - 15) - 2;
            if (length > fVar.f278588a) {
                int i18 = length + 128;
                fVar.f278588a = i18;
                fVar.f278591d = new byte[i18];
            }
            fVar.f278589b = length;
            java.lang.System.arraycopy(bArr, 0, fVar.f278591d, 0, length);
            byte[] a17 = k36.e.a(fVar.f278591d, 16, fVar.f278590c, fVar.f278594g.f278597c);
            if (a17 == null) {
                i17 = com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR;
            } else {
                fVar.f278590c = a17.length;
                if (a17.length + 15 + 2 > fVar.f278588a) {
                    int length2 = a17.length + 15 + 2;
                    fVar.f278588a = length2;
                    byte[] bArr2 = new byte[length2];
                    java.lang.System.arraycopy(fVar.f278591d, 0, bArr2, 0, fVar.f278589b);
                    fVar.f278591d = bArr2;
                }
                fVar.f278589b = 0;
                java.lang.System.arraycopy(a17, 0, fVar.f278591d, 16, a17.length);
                fVar.f278589b = a17.length + 17 + fVar.f278589b;
                i17 = 0;
            }
            if (i17 >= 0) {
                i17 = fVar.e(fVar.f278591d, 16, fVar.f278590c);
            }
        }
        if (i17 == 1) {
            b(hVar.f278600f);
        }
        oicq.wlogin_sdk.tools.util.c("user:" + hVar.f278600f + " ResolveSvrData ret=" + i17);
        return i17;
    }

    public final void g(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        h36.h hVar = this.f278578a;
        hVar.f278605k = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length = bArr.length + 1;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 35;
        java.lang.System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        java.security.SecureRandom secureRandom = hVar.f278595a;
        byte[] seed = java.security.SecureRandom.getSeed(16);
        byte[] bArr4 = new byte[seed.length + length];
        java.lang.System.arraycopy(seed, 0, bArr4, 0, seed.length);
        java.lang.System.arraycopy(bArr3, 0, bArr4, seed.length, length);
        hVar.f278596b = k36.d.k(bArr4);
    }
}
