package com.tencent.mm.plugin.mvvmbase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0005*\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ$\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\fJ\u001e\u0010\u000f\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ$\u0010\u000f\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "getUICScope", "Lj75/a;", "State", "Lj75/f;", "getStateCenter", "Lj75/c;", "processor", "Ljz5/f0;", "process", "Lkotlin/Function1;", "Le75/a;", "observer", "observe", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BaseMvvmActivity extends com.tencent.mm.ui.vas.VASActivity {
    public final <State extends j75.a> j75.f getStateCenter() {
        for (com.tencent.mm.ui.component.UIComponent uIComponent : getUiComponents()) {
            if (uIComponent instanceof wm3.n) {
                j75.f fVar = ((wm3.n) uIComponent).f447282d;
                if (fVar instanceof j75.f) {
                    return fVar;
                }
                return null;
            }
        }
        return null;
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope getUICScope() {
        return ((um3.b) pf5.z.f353948a.a(this).a(um3.b.class)).O6();
    }

    public final <State extends j75.a> void observe(e75.a observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.m3(this, observer);
        }
    }

    public final <State extends j75.a> void process(j75.c processor) {
        kotlin.jvm.internal.o.g(processor, "processor");
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.x(this, processor);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(um3.b.class);
        set.add(xn5.h1.class);
        set.add(wa5.j.class);
    }

    public final <State extends j75.a> void observe(yz5.l observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.L2(this, observer);
        }
    }

    public final <State extends j75.a> void process(yz5.l processor) {
        kotlin.jvm.internal.o.g(processor, "processor");
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.z3(this, processor);
        }
    }
}
