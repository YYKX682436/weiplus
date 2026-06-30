package lt3;

/* loaded from: classes4.dex */
public final class g extends dm.rb {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f321240y0 = dm.rb.initAutoDBInfo(lt3.g.class);

    /* renamed from: l1, reason: collision with root package name */
    public static final java.lang.String f321238l1 = "VideoEditInfo";

    /* renamed from: p1, reason: collision with root package name */
    public static final java.lang.String[] f321239p1 = dm.rb.C;

    public g() {
        new r45.tl5();
        new r45.hi0();
    }

    @Override // dm.rb, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 INFO = f321240y0;
        kotlin.jvm.internal.o.f(INFO, "INFO");
        return INFO;
    }

    public r45.on0 t0() {
        r45.on0 on0Var = new r45.on0();
        byte[] bArr = this.field_extraConfig;
        if (bArr != null) {
            try {
                on0Var.parseFrom(bArr);
                return on0Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
