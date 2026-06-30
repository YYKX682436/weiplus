package eu5;

/* loaded from: classes15.dex */
public abstract class e extends zt5.k {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f256827c;

    public e() {
        super(-1);
        this.f256827c = null;
    }

    @Override // zt5.k
    public java.lang.String toString() {
        java.lang.Object obj = this.f256827c;
        return obj == null ? super.toString() : java.lang.String.format("total: %s, extData: %s", super.toString(), obj.toString());
    }

    public e(int i17, java.lang.String str, java.lang.Object obj) {
        super(i17, str);
        this.f256827c = null;
        if (i17 == 1008) {
            this.f475606b = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
        } else if (i17 == 1011) {
            this.f475606b = "context instance already released. should not happen normally, you can try to call again";
        } else if (i17 == 1019) {
            this.f475606b = "upload or verify signature in server side failed";
        } else if (i17 == 1013) {
            this.f475606b = "there must be at least 1 biometric enrolled in system to complete this process. please check it previously";
        } else if (i17 != 1014) {
            switch (i17) {
                case 1002:
                    this.f475606b = "get support soter failed remotely";
                    break;
                case 1003:
                    this.f475606b = "upload app secure key";
                    break;
                case 1004:
                    this.f475606b = "upload auth key failed";
                    break;
            }
        } else {
            this.f475606b = "get challenge failed";
        }
        if (!zt5.l.b(str)) {
            this.f475606b = str;
        }
        this.f256827c = obj;
    }

    public e(int i17) {
        this(i17, "", null);
    }

    public e(int i17, java.lang.Object obj) {
        this(i17, "", obj);
    }
}
