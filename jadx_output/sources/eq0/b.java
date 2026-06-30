package eq0;

/* loaded from: classes11.dex */
public final class b implements com.tencent.wechat.zidl.MagicSclRequest {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.pigeon.flutter_magic_brush.MagicSclRequest f255783a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.zidl.MagicSclRequest.Callback f255784b;

    public b(com.tencent.pigeon.flutter_magic_brush.MagicSclRequest impl) {
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f255783a = impl;
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void attachFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        this.f255783a.attachFrameSet(str, str2, str3);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void changeFrameSetData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        this.f255783a.changeFrameSetData(str, str2, str3);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void clickFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        this.f255783a.clickFrameSet(str, str2, str3);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public java.lang.String createFrameSet(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return this.f255783a.createFrameSet(str, str2, i17);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public java.lang.String createFrameSetRoot(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        return this.f255783a.createFrameSetRoot(str, str2, str3);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void deatchFrameSet(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f255783a.detachFrameSet(str, str2);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void destroyFrameSet(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f255783a.destroyFrameSet(str, str2);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void destroyFrameSetRoot(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f255783a.destroyFrameSetRoot(str);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public java.lang.String getFrameSetCoverPath(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return this.f255783a.getFrameSetCoverPath(str, str2);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void pauseFrameSetRoot(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f255783a.pauseFrameSetRoot(str);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void preInitFrameSetAsync(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest magicSclRequest = this.f255783a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        magicSclRequest.preInitFrameSet(str, str2, str3, str4, new eq0.a(this, j17));
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void redrawFrameSet(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f255783a.redrawFrameSet(str, str2);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void redrawFrameSetRoot(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f255783a.redrawFrameSetRoot(str);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void resizeFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest magicSclRequest = this.f255783a;
        if (str == null) {
            str = "";
        }
        magicSclRequest.resizeFrameSet(str, str2 == null ? "" : str2, d17, d18);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void resumeFrameSetRoot(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f255783a.resumeFrameSetRoot(str);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void scrollFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest magicSclRequest = this.f255783a;
        if (str == null) {
            str = "";
        }
        magicSclRequest.scrollFrameSet(str, str2 == null ? "" : str2, d17, d18);
    }

    @Override // com.tencent.wechat.zidl.MagicSclRequest
    public void setCallback(com.tencent.wechat.zidl.MagicSclRequest.Callback callback) {
        this.f255784b = callback;
    }
}
