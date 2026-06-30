package y13;

/* loaded from: classes8.dex */
public final class f implements vh0.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y13.n f458883a;

    public f(y13.n nVar) {
        this.f458883a = nVar;
    }

    @Override // vh0.a1
    public void a() {
    }

    @Override // vh0.a1
    public void b() {
        y13.n nVar = this.f458883a;
        java.lang.Object value = ((jz5.n) nVar.f458891d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.LinearLayout) value).setVisibility(8);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) nVar.f458897m).getValue()).G("do_not_show_yuanbao_ad", true);
    }
}
