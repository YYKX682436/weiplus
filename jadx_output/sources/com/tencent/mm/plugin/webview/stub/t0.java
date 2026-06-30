package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public abstract class t0 extends android.os.Binder implements com.tencent.mm.plugin.webview.stub.v0 {
    public t0() {
        attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
    }

    public static com.tencent.mm.plugin.webview.stub.v0 d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.plugin.webview.stub.v0)) ? new com.tencent.mm.plugin.webview.stub.s0(iBinder) : (com.tencent.mm.plugin.webview.stub.v0) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            return true;
        }
        com.tencent.mm.plugin.webview.stub.z0 z0Var = null;
        switch (i17) {
            case 1:
                j45.l.g(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 2:
                java.lang.String displayName = ((com.tencent.mm.plugin.webview.stub.s) this).getDisplayName(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(displayName);
                return true;
            case 3:
                boolean J2 = c01.e2.J(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(J2 ? 1 : 0);
                return true;
            case 4:
                boolean D = c01.e2.D(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(D ? 1 : 0);
                return true;
            case 5:
                boolean j86 = ((com.tencent.mm.plugin.webview.stub.s) this).j8(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(j86 ? 1 : 0);
                return true;
            case 6:
                java.lang.String R9 = ((com.tencent.mm.plugin.webview.stub.s) this).R9(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(R9);
                return true;
            case 7:
                boolean b17 = fp.i.b();
                parcel2.writeNoException();
                parcel2.writeInt(b17 ? 1 : 0);
                return true;
            case 8:
                boolean isSDCardAvailable = ((com.tencent.mm.plugin.webview.stub.s) this).isSDCardAvailable();
                parcel2.writeNoException();
                parcel2.writeInt(isSDCardAvailable ? 1 : 0);
                return true;
            case 9:
                boolean a17 = gm0.j1.a();
                parcel2.writeNoException();
                parcel2.writeInt(a17 ? 1 : 0);
                return true;
            case 10:
                boolean s17 = c01.z1.s();
                parcel2.writeNoException();
                parcel2.writeInt(s17 ? 1 : 0);
                return true;
            case 11:
                int dg6 = ((com.tencent.mm.plugin.webview.stub.s) this).dg(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(dg6);
                return true;
            case 12:
                ((com.tencent.mm.plugin.webview.stub.s) this).Ui(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 13:
                int readInt = parcel.readInt();
                java.lang.String readString = parcel.readString();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(readInt, null);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str != null) {
                    readString = str;
                }
                parcel2.writeNoException();
                parcel2.writeString(readString);
                return true;
            case 14:
                ((com.tencent.mm.plugin.webview.stub.s) this).ng(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 15:
                com.tencent.mm.plugin.webview.stub.e jg6 = ((com.tencent.mm.plugin.webview.stub.s) this).jg((android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongInterface(jg6);
                return true;
            case 16:
                boolean uf6 = ((com.tencent.mm.plugin.webview.stub.s) this).uf((android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(uf6 ? 1 : 0);
                return true;
            case 17:
                int Sg = ((com.tencent.mm.plugin.webview.stub.s) this).Sg(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Sg);
                return true;
            case 18:
                ((com.tencent.mm.plugin.webview.stub.s) this).favEditTag();
                parcel2.writeNoException();
                return true;
            case 19:
                boolean F4 = ((com.tencent.mm.plugin.webview.stub.s) this).F4(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(F4 ? 1 : 0);
                return true;
            case 20:
                boolean T1 = ((com.tencent.mm.plugin.webview.stub.s) this).T1(parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(T1 ? 1 : 0);
                return true;
            case 21:
                ((com.tencent.mm.plugin.webview.stub.s) this).X9(parcel.readString(), parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean e17 = r01.z.e();
                parcel2.writeNoException();
                parcel2.writeInt(e17 ? 1 : 0);
                return true;
            case 23:
                java.util.List V3 = ((com.tencent.mm.plugin.webview.stub.s) this).V3();
                parcel2.writeNoException();
                parcel2.writeStringList(V3);
                return true;
            case 24:
                ((com.tencent.mm.plugin.webview.stub.s) this).hj(parcel.readInt(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 25:
                boolean Ua = ((com.tencent.mm.plugin.webview.stub.s) this).Ua(parcel.readString(), parcel.readInt() != 0, (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(Ua ? 1 : 0);
                return true;
            case 26:
                java.lang.String S1 = ((com.tencent.mm.plugin.webview.stub.s) this).S1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(S1);
                return true;
            case 27:
                ((com.tencent.mm.plugin.webview.stub.s) this).Gd(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 28:
                ((com.tencent.mm.plugin.webview.stub.s) this).m(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 29:
                boolean r66 = ((com.tencent.mm.plugin.webview.stub.s) this).r6(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(r66 ? 1 : 0);
                return true;
            case 30:
                android.os.Bundle U6 = ((com.tencent.mm.plugin.webview.stub.s) this).U6(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                com.tencent.mm.plugin.webview.stub.u0.b(parcel2, U6, 1);
                return true;
            case 31:
                android.os.Bundle tb6 = ((com.tencent.mm.plugin.webview.stub.s) this).tb(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                com.tencent.mm.plugin.webview.stub.u0.b(parcel2, tb6, 1);
                return true;
            case 32:
                ((com.tencent.mm.plugin.webview.stub.s) this).c9(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 33:
                android.os.Bundle r67 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(parcel.readInt()).r6();
                parcel2.writeNoException();
                com.tencent.mm.plugin.webview.stub.u0.b(parcel2, r67, 1);
                return true;
            case 34:
                boolean ja6 = ((com.tencent.mm.plugin.webview.stub.s) this).ja(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(ja6 ? 1 : 0);
                return true;
            case 35:
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
                boolean x86 = ((com.tencent.mm.plugin.webview.stub.s) this).x8(readString2, readString3, readString4, (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, creator), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, creator), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(x86 ? 1 : 0);
                return true;
            case 36:
                ((com.tencent.mm.plugin.webview.stub.s) this).q7(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 37:
                java.lang.String readString5 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = new com.tencent.mm.protocal.JsapiPermissionWrapper();
                jsapiPermissionWrapper.b(bundle);
                bundle2.putParcelable("proxyui_perm_key", jsapiPermissionWrapper);
                bundle2.putString("proxyui_username_key", readString5);
                bundle2.putInt("webview_binder_id", readInt2);
                com.tencent.mm.plugin.webview.stub.WebViewStubService.a(((com.tencent.mm.plugin.webview.stub.s) this).f183566d, 4, bundle2, readInt2);
                parcel2.writeNoException();
                return true;
            case 38:
                java.lang.String readString6 = parcel.readString();
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(readString6, false, false);
                if (j17 != null && com.tencent.mm.sdk.platformtools.t8.K0(j17.field_openId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "initView trigger getappsetting, appId = " + readString6);
                    com.tencent.mm.autogen.events.GetAppSettingEvent getAppSettingEvent = new com.tencent.mm.autogen.events.GetAppSettingEvent();
                    getAppSettingEvent.f54381g.f6950a = readString6;
                    getAppSettingEvent.e();
                }
                parcel2.writeNoException();
                return true;
            case 39:
                java.lang.String f37 = ((com.tencent.mm.plugin.webview.stub.s) this).f3(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(f37);
                return true;
            case 40:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("proxyui_expired_errtype", readInt3);
                bundle3.putInt("proxyui_expired_errcode", readInt4);
                com.tencent.mm.plugin.webview.stub.WebViewStubService.a(((com.tencent.mm.plugin.webview.stub.s) this).f183566d, 6, bundle3, readInt5);
                parcel2.writeNoException();
                return true;
            case 41:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
                    z0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.plugin.webview.stub.z0)) ? new com.tencent.mm.plugin.webview.stub.w0(readStrongBinder) : (com.tencent.mm.plugin.webview.stub.z0) queryLocalInterface;
                }
                ((com.tencent.mm.plugin.webview.stub.s) this).rg(z0Var, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 42:
                ((com.tencent.mm.plugin.webview.stub.s) this).A5(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.lang.String b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "WebViewConfig", "removeJavascriptInterface");
                java.lang.String[] split = com.tencent.mm.sdk.platformtools.t8.K0(b18) ? null : b18.split(";");
                parcel2.writeNoException();
                parcel2.writeStringArray(split);
                return true;
            case 44:
                java.lang.String ua6 = ((com.tencent.mm.plugin.webview.stub.s) this).ua();
                parcel2.writeNoException();
                parcel2.writeString(ua6);
                return true;
            case 45:
                java.lang.String b19 = com.tencent.mm.plugin.webview.model.c6.b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b19);
                return true;
            case 46:
                java.lang.String e18 = com.tencent.mm.sdk.platformtools.x2.e();
                com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = ((com.tencent.mm.plugin.webview.stub.s) this).f183566d;
                java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(webViewStubService.getSharedPreferences(e18, 0), webViewStubService);
                parcel2.writeNoException();
                parcel2.writeString(o17);
                return true;
            case 47:
                java.lang.String Yb = ((com.tencent.mm.plugin.webview.stub.s) this).Yb(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(Yb);
                return true;
            case 48:
                ip.h d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().d(1);
                java.util.Map map = d17 != null ? d17.f293567d : null;
                parcel2.writeNoException();
                parcel2.writeMap(map);
                return true;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                parcel.readString();
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 50:
                ((com.tencent.mm.plugin.webview.stub.s) this).Dd(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 51:
                java.lang.String u27 = ((com.tencent.mm.plugin.webview.stub.s) this).u2(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(u27);
                return true;
            case 52:
                java.lang.String language = ((com.tencent.mm.plugin.webview.stub.s) this).getLanguage();
                parcel2.writeNoException();
                parcel2.writeString(language);
                return true;
            case 53:
                java.lang.String m37 = ((com.tencent.mm.plugin.webview.stub.s) this).m3();
                parcel2.writeNoException();
                parcel2.writeString(m37);
                return true;
            case 54:
                int J3 = ((com.tencent.mm.plugin.webview.stub.s) this).J3();
                parcel2.writeNoException();
                parcel2.writeInt(J3);
                return true;
            case 55:
                int fd6 = ((com.tencent.mm.plugin.webview.stub.s) this).fd();
                parcel2.writeNoException();
                parcel2.writeInt(fd6);
                return true;
            case 56:
                ((com.tencent.mm.plugin.webview.stub.s) this).Ri();
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                ((com.tencent.mm.plugin.webview.stub.s) this).Y2();
                parcel2.writeNoException();
                return true;
            case 58:
                ((com.tencent.mm.plugin.webview.stub.s) this).pc(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                ((com.tencent.mm.plugin.webview.stub.s) this).M7(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 60:
                ((com.tencent.mm.plugin.webview.stub.s) this).Md(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                ((com.tencent.mm.plugin.webview.stub.s) this).cc(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 62:
                ((com.tencent.mm.plugin.webview.stub.s) this).u1(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 63:
                boolean I = c01.z1.I();
                parcel2.writeNoException();
                parcel2.writeInt(I ? 1 : 0);
                return true;
            case 64:
                ((com.tencent.mm.plugin.webview.stub.s) this).Ge(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 65:
                boolean T7 = ((com.tencent.mm.plugin.webview.stub.s) this).T7();
                parcel2.writeNoException();
                parcel2.writeInt(T7 ? 1 : 0);
                return true;
            case 66:
                boolean Yh = ((com.tencent.mm.plugin.webview.stub.s) this).Yh();
                parcel2.writeNoException();
                parcel2.writeInt(Yh ? 1 : 0);
                return true;
            case 67:
                ((com.tencent.mm.plugin.webview.stub.s) this).D8(parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 68:
                ((com.tencent.mm.plugin.webview.stub.s) this).b6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 69:
                ((com.tencent.mm.plugin.webview.stub.s) this).yf(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 70:
                android.os.Bundle i19 = ((com.tencent.mm.plugin.webview.stub.s) this).i(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                com.tencent.mm.plugin.webview.stub.u0.b(parcel2, i19, 1);
                return true;
            case 71:
                ((com.tencent.mm.plugin.webview.stub.s) this).af((android.content.Intent) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.content.Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 72:
                ((com.tencent.mm.plugin.webview.stub.s) this).x7(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                java.util.List bc6 = ((com.tencent.mm.plugin.webview.stub.s) this).bc();
                parcel2.writeNoException();
                parcel2.writeStringList(bc6);
                return true;
            case 74:
                ((com.tencent.mm.plugin.webview.stub.s) this).pb((android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 75:
                int i27 = h45.g0.f278945a;
                parcel2.writeNoException();
                parcel2.writeInt(i27);
                return true;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                java.lang.String b27 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "AsyncCheckUrl", "UrlHost");
                java.lang.String[] split2 = com.tencent.mm.sdk.platformtools.t8.K0(b27) ? null : b27.split(";");
                parcel2.writeNoException();
                parcel2.writeStringArray(split2);
                return true;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                ((com.tencent.mm.plugin.webview.stub.s) this).j7(parcel.readInt(), (android.os.Bundle) com.tencent.mm.plugin.webview.stub.u0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
