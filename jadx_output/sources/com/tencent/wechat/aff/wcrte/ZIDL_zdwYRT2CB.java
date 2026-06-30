package com.tencent.wechat.aff.wcrte;

/* loaded from: classes16.dex */
class ZIDL_zdwYRT2CB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.wcrte.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.wcrte.b f217609a;

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18, byte[] bArr);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18, byte[] bArr);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18, byte[] bArr);

    private native void ZIDL_GX(long j17, long j18, byte[] bArr);

    private native void ZIDL_HX(long j17, long j18, byte[] bArr);

    public void Q1(long j17, java.lang.String str) {
        ZIDL_HX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void R1(long j17, java.lang.String str) {
        ZIDL_GX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void S1(long j17, java.lang.String str) {
        ZIDL_DX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void T1(long j17, java.lang.String str) {
        ZIDL_FX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void U1(long j17) {
        ZIDL_EX(this.nativeHandler, j17);
    }

    public void ZIDL_AV(long j17) {
        this.f217609a.getClass();
    }

    public void ZIDL_BV(long j17) {
        this.f217609a.getClass();
    }

    public void ZIDL_CV(long j17, int i17) {
        com.tencent.wechat.aff.wcrte.c cVar;
        com.tencent.wechat.aff.wcrte.b bVar = this.f217609a;
        switch (i17) {
            case 1:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Recording;
                break;
            case 2:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Recording_ClickCellStop;
                break;
            case 3:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Recording_tryLater;
                break;
            case 4:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_NonTxtNum_Exceed;
                break;
            case 5:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_DownloadHtml_Fail;
                break;
            case 6:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_DownloadHtml_Expired;
                break;
            case 7:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_MultiTalk_Conflict;
                break;
            case 8:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_WNVersion_Conflict;
                break;
            case 9:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Note_Too_Long;
                break;
            case 10:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Note_Too_Much;
                break;
            case 11:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Recording_Undo;
                break;
            case 12:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Image_No_Exist;
                break;
            case 13:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_FileSize_Exceed_Max;
                break;
            case 14:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Exceed_MaxSize;
                break;
            case 15:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Max_Undo_Limit;
                break;
            case 16:
                cVar = com.tencent.wechat.aff.wcrte.c.RTEAlertType_Publish_Fail;
                break;
            default:
                cVar = null;
                break;
        }
        gz4.a aVar = (gz4.a) bVar;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i(aVar.f277759a, "showAlertAsync: taskId = " + j17 + ", alertType = " + cVar);
    }

    public void ZIDL_DV(long j17) {
        com.tencent.wechat.aff.wcrte.a aVar = ((gz4.a) this.f217609a).f277760b;
        if (aVar != null) {
            ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar).S1(j17, com.tencent.mm.sdk.platformtools.b0.a().toString());
        }
    }

    public void ZIDL_EV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.wcrte.b bVar = this.f217609a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        gz4.a aVar = (gz4.a) bVar;
        aVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.sdk.platformtools.b0.e(str);
        }
        com.tencent.wechat.aff.wcrte.a aVar2 = aVar.f277760b;
        if (aVar2 != null) {
            ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar2).U1(j17);
        }
    }

    public void ZIDL_FV(long j17, int i17) {
        com.tencent.wechat.aff.wcrte.d dVar;
        java.lang.String str;
        int i18;
        com.tencent.wechat.aff.wcrte.b bVar = this.f217609a;
        if (i17 == 11000) {
            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Wemoji;
        } else if (i17 == 20000) {
            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_ConvertedText;
        } else if (i17 != 30000) {
            switch (i17) {
                case 0:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Unknown;
                    break;
                case 1:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Image;
                    break;
                case 2:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Video;
                    break;
                case 3:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_File;
                    break;
                case 4:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Location;
                    break;
                case 5:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Voice;
                    break;
                case 6:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_ChatVoice;
                    break;
                case 7:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Gif;
                    break;
                case 8:
                    dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_WebPage;
                    break;
                default:
                    switch (i17) {
                        case 10000:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Font;
                            break;
                        case 10001:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_UnorderList;
                            break;
                        case 10002:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_OrderList;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Todo;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_ListContent;
                            break;
                        case 10005:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Hr;
                            break;
                        case 10006:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Quote;
                            break;
                        case 10007:
                            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_Tab;
                            break;
                        default:
                            dVar = null;
                            break;
                    }
            }
        } else {
            dVar = com.tencent.wechat.aff.wcrte.d.RTEAttributeNodeType_MD_Unknown;
        }
        com.tencent.wechat.aff.wcrte.a aVar = ((gz4.a) bVar).f277760b;
        if (aVar != null) {
            if (dVar != null) {
                switch (dVar.ordinal()) {
                    case 1:
                    case 7:
                        i18 = com.tencent.mm.R.string.l_p;
                        break;
                    case 2:
                        i18 = com.tencent.mm.R.string.l_r;
                        break;
                    case 3:
                        i18 = com.tencent.mm.R.string.l_o;
                        break;
                    case 4:
                        i18 = com.tencent.mm.R.string.l_q;
                        break;
                    case 5:
                    case 6:
                        i18 = com.tencent.mm.R.string.l_s;
                        break;
                    default:
                        i18 = 0;
                        break;
                }
                if (i18 != 0) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i18);
                    kotlin.jvm.internal.o.d(str);
                    ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar).T1(j17, str);
                }
            }
            str = "";
            ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar).T1(j17, str);
        }
    }

    public void ZIDL_GV(long j17) {
        com.tencent.wechat.aff.wcrte.a aVar = ((gz4.a) this.f217609a).f277760b;
        if (aVar != null) {
            ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar).R1(j17, com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
    }

    public void ZIDL_HV(long j17) {
        com.tencent.wechat.aff.wcrte.a aVar = ((gz4.a) this.f217609a).f277760b;
        if (aVar != null) {
            ((com.tencent.wechat.aff.wcrte.ZIDL_zdwYRT2CB) aVar).Q1(j17, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.cbu));
        }
    }

    public void ZIDL_I() {
        com.tencent.mars.xlog.Log.i(((gz4.a) this.f217609a).f277759a, "resetCopyAttachmentInPasteBored: ");
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.wcrte.b bVar = (com.tencent.wechat.aff.wcrte.b) obj;
        this.f217609a = bVar;
        ((gz4.a) bVar).f277760b = this;
    }
}
