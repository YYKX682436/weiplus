package com.tencent.mm.ui.anim;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo4;", "Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerSharedElementDemo4 extends com.tencent.mm.ui.anim.RepairerSharedElementDemo2 {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f197163n = jz5.h.b(new na5.c0(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f197164o = jz5.h.b(new na5.y(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f197165p = jz5.h.b(new na5.z(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f197166q = jz5.h.b(new na5.a0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f197167r = jz5.h.b(new na5.b0(this));

    @Override // com.tencent.mm.ui.anim.RepairerSharedElementDemo2
    public void W6(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        ((android.widget.ImageView) ((jz5.n) this.f197164o).getValue()).setImageResource(((java.lang.Number) dataList.get(0)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f197165p).getValue()).setImageResource(((java.lang.Number) dataList.get(1)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f197166q).getValue()).setImageResource(((java.lang.Number) dataList.get(2)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f197167r).getValue()).setImageResource(((java.lang.Number) dataList.get(3)).intValue());
    }

    @Override // com.tencent.mm.ui.anim.RepairerSharedElementDemo2
    public void X6(int i17) {
        java.util.List U6 = U6(i17);
        W6(U6);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo2.f197153m = U6;
    }

    @Override // com.tencent.mm.ui.anim.RepairerSharedElementDemo2, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bpg;
    }

    @Override // com.tencent.mm.ui.anim.RepairerSharedElementDemo2, com.tencent.mm.ui.MMActivity
    public void initView() {
    }

    @Override // com.tencent.mm.ui.anim.RepairerSharedElementDemo2, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("SharedElementDemo4");
        X6(4);
        ((android.widget.LinearLayout) ((jz5.n) this.f197163n).getValue()).setOnClickListener(new na5.d0(this));
    }
}
