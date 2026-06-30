package db5;

/* loaded from: classes11.dex */
public class i6 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228395d;

    public i6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228395d = mMTagPanel;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        int action = keyEvent.getAction();
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228395d;
        if (action == 0 && 67 == i17) {
            mMTagPanel.F.getSelectionStart();
            mMTagPanel.F.getSelectionEnd();
            if (!(mMTagPanel.F.getSelectionStart() == 0 && mMTagPanel.F.getSelectionStart() == mMTagPanel.F.getSelectionEnd())) {
                yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            mMTagPanel.m();
            java.util.LinkedList linkedList2 = mMTagPanel.A;
            if (linkedList2 == null || linkedList2.isEmpty()) {
                yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            if (!mMTagPanel.f197584p && mMTagPanel.f197594z == null) {
                mMTagPanel.f197594z = (db5.b7) mMTagPanel.A.getLast();
                mMTagPanel.u(mMTagPanel.f197594z.f228296b, false, true);
                mMTagPanel.F.setCursorVisible(false);
            } else if (mMTagPanel.f197594z == null || (linkedList = mMTagPanel.A) == null || linkedList.getLast() == null || com.tencent.mm.sdk.platformtools.t8.K0(mMTagPanel.f197594z.f228295a) || com.tencent.mm.sdk.platformtools.t8.K0(((db5.b7) mMTagPanel.A.getLast()).f228295a) || mMTagPanel.f197594z.f228295a.equals(((db5.b7) mMTagPanel.A.getLast()).f228295a)) {
                java.lang.String str = ((db5.b7) mMTagPanel.A.getLast()).f228295a;
                mMTagPanel.p(str);
                db5.t6 t6Var = mMTagPanel.C;
                if (t6Var != null) {
                    t6Var.a(str);
                }
                mMTagPanel.h();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTagPanel", "change hight");
                mMTagPanel.h();
                mMTagPanel.f197594z = (db5.b7) mMTagPanel.A.getLast();
                mMTagPanel.u(mMTagPanel.f197594z.f228296b, false, true);
                mMTagPanel.F.setCursorVisible(false);
            }
        }
        db5.a7 a7Var = mMTagPanel.L;
        if (a7Var != null) {
            w82.b1 b1Var = (w82.b1) a7Var;
            if (67 == i17) {
                com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = b1Var.f443826a;
                if (favTopTagPanel.M.size() > 0 && ((com.tencent.mm.sdk.platformtools.t8.K0(favTopTagPanel.f101563x0) && com.tencent.mm.sdk.platformtools.t8.K0(favTopTagPanel.f101564y0)) || (com.tencent.mm.sdk.platformtools.t8.K0(favTopTagPanel.f101563x0) && !com.tencent.mm.sdk.platformtools.t8.K0(favTopTagPanel.f101564y0) && favTopTagPanel.f101560l1 > 1))) {
                    java.util.ArrayList arrayList2 = favTopTagPanel.M;
                    java.lang.Object obj = arrayList2.get(arrayList2.size() - 1);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    favTopTagPanel.y((w82.s0) obj, true, 19);
                    favTopTagPanel.f101560l1 = 1;
                }
                favTopTagPanel.f101560l1++;
            } else {
                b1Var.getClass();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
