package dk2;

/* loaded from: classes3.dex */
public final class g3 implements db2.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f233494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f233496c;

    public g3(com.tencent.mm.ui.MMActivity mMActivity, yz5.p pVar, boolean z17) {
        this.f233494a = mMActivity;
        this.f233495b = pVar;
        this.f233496c = z17;
    }

    @Override // db2.c2
    public void a(int i17, int i18, java.lang.String str, r45.q62 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new dk2.f3(this.f233494a, i17, i18, this.f233495b, resp, this.f233496c));
    }
}
