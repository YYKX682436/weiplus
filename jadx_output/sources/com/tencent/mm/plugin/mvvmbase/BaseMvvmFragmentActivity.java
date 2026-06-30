package com.tencent.mm.plugin.mvvmbase;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmFragmentActivity;", "Lcom/tencent/mm/ui/vas/launcher/VASLauncher;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class BaseMvvmFragmentActivity extends com.tencent.mm.ui.vas.launcher.VASLauncher {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f152056g = true;

    /* renamed from: b7, reason: from getter */
    public boolean getF152056g() {
        return this.f152056g;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(um3.b.class);
        if (getF152056g()) {
            set.add(xn5.h1.class);
        }
        set.add(wa5.j.class);
        set.add(uj5.e.class);
    }
}
