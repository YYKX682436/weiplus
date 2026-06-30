package qc1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qc1.c f361459i;

    public b(qc1.c cVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f361459i = cVar;
        this.f361458h = v5Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        this.f361459i.getClass();
        com.tencent.mm.plugin.appbrand.widget.input.p4 b17 = com.tencent.mm.plugin.appbrand.widget.input.r1.b(this.f361458h);
        if (b17 == null) {
            return null;
        }
        return new int[]{b17.h().getSelectionStart(), b17.h().getSelectionEnd()};
    }
}
