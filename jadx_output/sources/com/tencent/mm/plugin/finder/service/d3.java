package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.finder.service.l3 l3Var) {
        super(0);
        this.f126032d = l3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126032d;
        try {
            java.util.Set set = l3Var.f126133s;
            kotlin.jvm.internal.o.f(set, "access$getEnterFinderActivity$p(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) obj;
                kotlin.jvm.internal.o.d(appCompatActivity);
                if (l3Var.Di(appCompatActivity)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity2 = (androidx.appcompat.app.AppCompatActivity) it.next();
                com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional finder ui, ui = " + appCompatActivity2.getClass().getSimpleName());
                appCompatActivity2.setResult(0);
                appCompatActivity2.finishAffinity();
            }
            java.util.Set<android.app.Activity> set2 = l3Var.f126137w;
            kotlin.jvm.internal.o.f(set2, "access$getEnteredNonFinderActivity$p(...)");
            for (android.app.Activity activity : set2) {
                com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional non finder ui, ui = " + activity.getClass().getSimpleName());
                activity.setResult(0);
                activity.finishAffinity();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "checkClearFinderTask2: crash,", th6);
            pm0.z.b(xy2.b.f458155b, "clearFinderTaskCrash2", false, null, null, false, false, new com.tencent.mm.plugin.finder.service.c3(th6), 60, null);
        }
        return jz5.f0.f302826a;
    }
}
