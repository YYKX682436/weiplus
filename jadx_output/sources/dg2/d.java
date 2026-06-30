package dg2;

/* loaded from: classes2.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dg2.e f232286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f232287b;

    public d(dg2.e eVar, java.lang.Object obj) {
        this.f232286a = eVar;
        this.f232287b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        java.lang.Object obj = this.f232287b;
        dg2.e eVar = this.f232286a;
        if (z17) {
            if (!eVar.f232289e.contains(obj)) {
                eVar.f232289e.add(obj);
            }
        } else if (eVar.f232289e.contains(obj)) {
            eVar.f232289e.remove(obj);
        }
        yz5.l lVar = eVar.f232292h;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(!eVar.f232289e.isEmpty()));
        }
    }
}
