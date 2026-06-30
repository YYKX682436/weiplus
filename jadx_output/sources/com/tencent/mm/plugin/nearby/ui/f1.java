package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class f1 implements db5.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152138a;

    public f1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152138a = nearbySayHiListUI;
    }

    @Override // db5.b6
    public int a(android.view.View view) {
        return this.f152138a.f152112f.getPositionForView(view);
    }
}
