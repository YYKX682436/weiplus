package hf2;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f281027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(hf2.h0 h0Var, int i17) {
        super(1);
        this.f281027d = h0Var;
        this.f281028e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        java.util.LinkedList linkedList2;
        r45.ji0 ji0Var2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        qc0.j2 status = (qc0.j2) obj;
        kotlin.jvm.internal.o.g(status, "status");
        hf2.h0 h0Var = this.f281027d;
        java.lang.String str = h0Var.f281071b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("StickerItemBehaviorStatus: ");
        sb6.append(status);
        sb6.append(",stickerType:");
        int i17 = this.f281028e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        boolean b17 = kotlin.jvm.internal.o.b(status, qc0.g2.f361384c);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hf2.x xVar = h0Var.f281070a;
        if (!b17) {
            ((hf2.f1) ((jz5.n) xVar.B).getValue()).a(i17, status);
            return f0Var;
        }
        android.graphics.Bitmap bitmap = status.f361390a;
        if (bitmap != null) {
            bitmap.getByteCount();
        }
        android.graphics.Bitmap bitmap2 = status.f361390a;
        if (bitmap2 != null) {
            bitmap2.getWidth();
        }
        android.graphics.Bitmap bitmap3 = status.f361390a;
        if (bitmap3 != null) {
            bitmap3.getHeight();
        }
        r45.ei0 ei0Var = status.f361391b;
        if (ei0Var != null && (linkedList4 = ei0Var.f373529d) != null) {
            linkedList4.size();
        }
        r45.ei0 ei0Var2 = status.f361391b;
        if (ei0Var2 != null && (linkedList3 = ei0Var2.f373529d) != null) {
        }
        xVar.t7("TEXT_FINISH_EDITING_SUCCESS_RESULT", status.f361391b);
        android.view.View view = h0Var.f281073d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget$launchStickerEditorContainer$5", "invoke", "(Lcom/tencent/mm/feature/recordvideo/api/StickerEditorItemBehaviorStatus;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget$launchStickerEditorContainer$5", "invoke", "(Lcom/tencent/mm/feature/recordvideo/api/StickerEditorItemBehaviorStatus;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        hf2.l2 l76 = xVar.l7();
        r45.ei0 ei0Var3 = xVar.f281185q;
        java.lang.String str2 = (ei0Var3 == null || (linkedList2 = ei0Var3.f373529d) == null || (ji0Var2 = (r45.ji0) kz5.n0.Z(linkedList2)) == null) ? null : ji0Var2.f377829n;
        l76.b("TEXT_FINISH_EDITING_SUCCESS_RESULT", !(str2 == null || str2.length() == 0));
        com.tencent.mm.plugin.finder.live.util.y.o(h0Var.f281070a, null, null, new hf2.b0(h0Var, null), 3, null);
        android.graphics.Bitmap bitmap4 = status.f361390a;
        if (bitmap4 == null) {
            return null;
        }
        hf2.b2 h76 = xVar.h7();
        r45.ei0 ei0Var4 = status.f361391b;
        h76.d("editor_confirm", bitmap4, (ei0Var4 == null || (linkedList = ei0Var4.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f377827i);
        return f0Var;
    }
}
