package z63;

/* loaded from: classes5.dex */
public class z implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470452d;

    public z(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470452d = groupSolitatireEditUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.util.ArrayList arrayList;
        android.view.View view;
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470452d;
        if (groupSolitatireEditUI.G) {
            groupSolitatireEditUI.f7(4);
            return;
        }
        groupSolitatireEditUI.getClass();
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i17 = 1;
            while (true) {
                int size = groupSolitatireEditUI.B.N.size();
                arrayList = groupSolitatireEditUI.M;
                if (i17 > size) {
                    break;
                }
                y63.b bVar = (y63.b) groupSolitatireEditUI.B.N.get(java.lang.Integer.valueOf(i17));
                if (bVar != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459656e.trim()) && ((android.view.View) arrayList.get(i17 - 1)).getTag() == null) {
                        arrayList2.add(java.lang.Integer.valueOf(i17));
                    } else {
                        arrayList3.add(bVar);
                    }
                }
                i17++;
            }
            java.util.Collections.sort(arrayList2, new z63.v(groupSolitatireEditUI));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                if (num.intValue() - 1 < arrayList.size() && (view = (android.view.View) arrayList.get(num.intValue() - 1)) != null) {
                    groupSolitatireEditUI.f142225n.removeView(view);
                    arrayList.remove(num.intValue() - 1);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                i18++;
                ((android.widget.TextView) ((android.view.View) it6.next()).findViewById(com.tencent.mm.R.id.gud)).setText(i18 + "");
            }
            groupSolitatireEditUI.B.N.clear();
            java.util.Iterator it7 = arrayList3.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                i19++;
                groupSolitatireEditUI.B.N.put(java.lang.Integer.valueOf(i19), (y63.b) it7.next());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "updateContent Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        if (groupSolitatireEditUI.B.N.size() < x63.g.w()) {
            groupSolitatireEditUI.f7(0);
        }
        groupSolitatireEditUI.f142228q.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470452d;
        if (groupSolitatireEditUI.G) {
            groupSolitatireEditUI.f142228q.setVisibility(0);
        }
    }
}
