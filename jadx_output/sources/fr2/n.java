package fr2;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265734a;

    public n(fr2.p pVar) {
        this.f265734a = pVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            fr2.p pVar = this.f265734a;
            android.app.Activity context = pVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.plugin.finder.assist.a4.f102002a.a(java.lang.String.valueOf(V6.getInteger(5)), "", V6.getString(1), "chatroom_page_start_live", "");
            fr2.p.P6(pVar, 1);
        }
    }
}
