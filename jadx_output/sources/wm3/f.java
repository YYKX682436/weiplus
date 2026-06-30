package wm3;

/* loaded from: classes9.dex */
public final class f implements com.tencent.mm.ui.base.preference.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wm3.j f447266a;

    public f(wm3.j jVar) {
        this.f447266a = jVar;
    }

    @Override // com.tencent.mm.ui.base.preference.g0
    public void a(android.view.View view, com.tencent.mm.ui.base.preference.Preference preference) {
        if (view != null && preference != null) {
            wm3.j jVar = this.f447266a;
            jVar.f447279o.put(view, new java.lang.ref.WeakReference(preference));
            java.util.Set entrySet = jVar.f447279o.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if (kotlin.jvm.internal.o.b(preference2 != null ? preference2.f197780q : null, preference.f197780q)) {
                    if (!kotlin.jvm.internal.o.b(entry.getKey(), view)) {
                        jVar.f447279o.remove(entry.getKey());
                    }
                }
            }
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(view);
        }
    }
}
