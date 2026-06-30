package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class z2 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f158562b;

    public z2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f158561a = b3Var;
        this.f158562b = appCompatActivity;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        java.util.List data2;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onScrollStatsChanged");
        int i17 = data.f293152e;
        com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158561a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = b3Var.f158357m;
        int size = (wxRecyclerAdapter == null || (data2 = wxRecyclerAdapter.getData()) == null) ? 0 : data2.size();
        if (!b3Var.f158362r && i17 != -1 && size - i17 <= 10 && size > 0) {
            b3Var.P6().v();
        }
        java.util.LinkedList linkedList = data.f293156i;
        if (!linkedList.isEmpty()) {
            kotlinx.coroutines.l.d(b3Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.y2(linkedList, b3Var, this.f158562b, null), 3, null);
        }
    }
}
