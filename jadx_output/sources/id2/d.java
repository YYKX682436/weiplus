package id2;

/* loaded from: classes3.dex */
public final class d implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.l f290521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm2.y6 f290522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f290523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f290524d;

    public d(id2.l lVar, mm2.y6 y6Var, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.widget.Button button) {
        this.f290521a = lVar;
        this.f290522b = y6Var;
        this.f290523c = neatTextView;
        this.f290524d = button;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        if (i17 == -1) {
            id2.l lVar = this.f290521a;
            lVar.f290652f = false;
            mm2.y6 y6Var = this.f290522b;
            y6Var.g(intent);
            android.widget.Button okBtn = this.f290524d;
            kotlin.jvm.internal.o.f(okBtn, "$okBtn");
            id2.l.O6(lVar, y6Var, this.f290523c, okBtn);
        }
    }
}
