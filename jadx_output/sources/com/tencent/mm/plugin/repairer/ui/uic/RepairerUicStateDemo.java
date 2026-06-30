package com.tencent.mm.plugin.repairer.ui.uic;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RepairerUicStateDemo extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cga;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{ix3.v5.class, ix3.x5.class});
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pf5.z zVar = pf5.z.f353948a;
        ix3.u5 uicState = ((ix3.v5) zVar.a(this).a(ix3.v5.class)).f295591d;
        ix3.w5 uicState2 = (ix3.w5) ((pf5.d) zVar.a(this).c(ix3.a.class)).h6();
        sf5.l lVar = new sf5.l();
        kotlin.jvm.internal.o.g(uicState, "uicState");
        java.util.LinkedList linkedList = lVar.f407646a;
        linkedList.add(uicState);
        kotlin.jvm.internal.o.g(uicState2, "uicState");
        linkedList.add(uicState2);
        sf5.k kVar = new sf5.k(lVar);
        kVar.f407645c = ix3.i4.f295449d;
        kVar.f407644b = ix3.j4.f295468d;
        kotlinx.coroutines.flow.i2 a17 = kVar.a(getLifecycleAsyncScope(), 1);
        sf5.l lVar2 = new sf5.l();
        java.util.LinkedList linkedList2 = lVar2.f407646a;
        linkedList2.add(uicState);
        linkedList2.add(uicState2);
        sf5.k kVar2 = new sf5.k(lVar2);
        kVar2.f407645c = ix3.k4.f295474d;
        kVar2.f407644b = ix3.l4.f295490d;
        kotlinx.coroutines.y0 lifecycleScope = getLifecycleAsyncScope();
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kVar2.f407638a.getClass();
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new sf5.g(kVar2, a18, null), 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateTransform2.init=");
        kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) a18;
        sb6.append((java.lang.String) h3Var.getValue());
        com.tencent.mars.xlog.Log.i("RepairerUicStateDemo", sb6.toString());
        androidx.lifecycle.c1 a19 = zVar.a(this).a(um3.b.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        pf5.e.launch$default((pf5.e) a19, null, null, new ix3.f4(a17, h3Var, null), 3, null);
        findViewById(com.tencent.mm.R.id.o2t).setOnClickListener(new ix3.g4(uicState));
        findViewById(com.tencent.mm.R.id.b5d).setOnClickListener(new ix3.h4(this));
    }
}
