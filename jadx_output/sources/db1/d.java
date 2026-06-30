package db1;

/* loaded from: classes5.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db1.p f227838a;

    public d(db1.p pVar) {
        this.f227838a = pVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        db1.p pVar = this.f227838a;
        pVar.D.invoke(java.lang.Boolean.valueOf(z17));
        pVar.f227866w.setEnabled(z17);
    }
}
