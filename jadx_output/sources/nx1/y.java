package nx1;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.z f341328d;

    public y(nx1.z zVar) {
        this.f341328d = zVar;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        boolean w17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        if (nx1.d.q().B() == 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        nx1.z zVar = this.f341328d;
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText b17 = zVar.b();
        if (b17 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        int recyclerItemPosition = b17.getRecyclerItemPosition();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "current focus pos: %d", java.lang.Integer.valueOf(recyclerItemPosition));
        ix1.a l17 = nx1.d.q().l(recyclerItemPosition);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXRTManager", "get current item is null %d", java.lang.Integer.valueOf(recyclerItemPosition));
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        int i18 = recyclerItemPosition - 1;
        ix1.a l18 = nx1.d.q().l(i18);
        if (l18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "get preItem is null %d", java.lang.Integer.valueOf(recyclerItemPosition));
            if (b17.getEditTextType() == 0 && !nx1.z.a(zVar, b17, recyclerItemPosition)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
        }
        int editTextType = b17.getEditTextType();
        if (editTextType == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "Handle Editor Type EDITTEXT");
            if (!nx1.z.a(zVar, b17, recyclerItemPosition)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            java.lang.String w18 = b17.w(nx1.w.f341324b);
            nx1.d.q().i();
            if (l18.b() == 1) {
                w17 = nx1.d.q().w(recyclerItemPosition, true);
                ix1.l lVar = (ix1.l) l18;
                int length = lVar.f295316f.getText().toString().length();
                lVar.f295338s += w18;
                lVar.f295313c = length;
                lVar.f295312b = true;
                lVar.f295317g = false;
            } else {
                w17 = com.tencent.mm.sdk.platformtools.t8.K0(w18) ? nx1.d.q().w(recyclerItemPosition, true) : false;
                l18.f295315e.setSelection(0);
                l18.f295312b = true;
                l18.f295317g = false;
            }
            if (w17) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
                editorUI.getClass();
                editorUI.j3(i18, 0L);
            } else {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
                editorUI2.getClass();
                editorUI2.e7(i18, 2);
            }
        } else if (editTextType == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "Handle Editor Type PREBUTTON");
            if (l18 == null) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            nx1.d.q().i();
            if (l18.b() == 1) {
                ix1.l lVar2 = (ix1.l) l18;
                if (com.tencent.mm.sdk.platformtools.t8.K0(lVar2.f295338s)) {
                    l17.f295314d.setSelection(0);
                    l17.f295312b = true;
                    l17.f295317g = true;
                    nx1.d.q().w(i18, true);
                    yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
                if (lVar2.f295338s.endsWith("<br/>")) {
                    lVar2.f295338s = lVar2.f295338s.substring(0, r4.length() - 5);
                    lVar2.f295313c = -1;
                    lVar2.f295312b = true;
                    lVar2.f295317g = false;
                } else {
                    lVar2.f295313c = -1;
                    lVar2.f295312b = true;
                    lVar2.f295317g = false;
                }
            } else {
                l18.f295315e.setSelection(0);
                l18.f295312b = true;
                l18.f295317g = false;
            }
            com.tencent.mm.plugin.component.editor.EditorUI editorUI3 = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
            editorUI3.getClass();
            editorUI3.e7(i18, 2);
        } else if (editTextType == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "Handle Editor Type NEXTBTTTON");
            if (l17.b() == 4 && ((ix1.n) l17).f295349w.booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXRTManager", "Current Item is Voice and Recording");
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            if (!l17.f295318h && l17.b() != -1) {
                nx1.d.q().z(recyclerItemPosition, true, true);
                yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            nx1.d.q().i();
            nx1.d.q().w(recyclerItemPosition, false);
            com.tencent.mm.plugin.component.editor.EditorUI editorUI4 = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
            editorUI4.getClass();
            editorUI4.x1(recyclerItemPosition);
            ix1.l lVar3 = new ix1.l();
            lVar3.f295312b = true;
            lVar3.f295317g = false;
            lVar3.f295338s = "";
            lVar3.f295313c = 0;
            nx1.d.q().a(recyclerItemPosition, lVar3, true);
            nx1.d.q().d(i18, recyclerItemPosition + 1, true);
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b).f96497d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(recyclerItemPosition));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
