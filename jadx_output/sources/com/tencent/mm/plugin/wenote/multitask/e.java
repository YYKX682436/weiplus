package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes8.dex */
public final class e extends jk3.v {
    public java.lang.String A;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.ref.WeakReference f188132x;

    /* renamed from: y, reason: collision with root package name */
    public int f188133y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f188134z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.MMActivity activity, ak3.c pageAdapter) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        this.f188132x = new java.lang.ref.WeakReference(activity);
        this.f188134z = "";
        this.A = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "create, NoteEditorUI:%s", java.lang.Integer.valueOf(activity.hashCode()));
    }

    @Override // jk3.v
    public void O(jk3.g gVar) {
        com.tencent.mm.ui.MMActivity mMActivity;
        if (a() && (mMActivity = (com.tencent.mm.ui.MMActivity) this.f188132x.get()) != null) {
            mMActivity.hideVKB();
        }
        super.O(gVar);
    }

    public final boolean c0(int i17, java.lang.String title, boolean z17) {
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) this.f188132x.get();
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
        this.A = title;
        j();
        return U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public void j() {
        if (this.f188133y == 0) {
            return;
        }
        try {
            r45.sw4 sw4Var = new r45.sw4();
            sw4Var.set(0, java.lang.Integer.valueOf(this.f188133y));
            sw4Var.set(1, this.f188134z);
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
            if (v07 != null) {
                v07.set(1, this.A);
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
            if (multiTaskInfo2 == null) {
                return;
            }
            multiTaskInfo2.field_data = sw4Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "not ended update historyTaskInfo");
            m(bitmap);
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        android.app.Activity activity;
        android.app.Activity activity2;
        android.view.Window window;
        android.view.View decorView;
        super.y(i17, str);
        boolean a17 = a();
        ak3.c cVar = this.f300111d;
        if (a17) {
            if (cVar != null && (activity2 = cVar.getActivity()) != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundColor(0);
            }
            if (cVar != null && (activity = cVar.getActivity()) != null) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477783bc, 0);
            }
            db5.f.c(cVar != null ? cVar.getActivity() : null, null);
        }
        if (cVar != null) {
            cVar.l();
        }
    }
}
