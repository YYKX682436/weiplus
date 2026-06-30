package sr2;

/* loaded from: classes.dex */
public final class k implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.o f411607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411608b;

    public k(sr2.o oVar, android.view.View view) {
        this.f411607a = oVar;
        this.f411608b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        this.f411607a.getClass();
        this.f411608b.setEnabled(z17);
    }
}
