package yw3;

/* loaded from: classes4.dex */
public final class w3 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466919d;

    public w3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f466919d = repairerMvvmDBDemoUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        kotlin.jvm.internal.o.g(event, "event");
        yw3.v3 v3Var = new yw3.v3(this.f466919d);
        if (!kotlin.jvm.internal.o.b(event.f343587a, o75.b.f343585f)) {
            v3Var.invoke(event);
            return;
        }
        java.util.HashMap hashMap = event.f343591e;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                v3Var.invoke(((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }
}
