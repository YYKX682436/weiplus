package zo1;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.f f474653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI, com.tencent.wechat.aff.affroam.f fVar) {
        super(0);
        this.f474652d = checkPackageContentUI;
        this.f474653e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474652d;
        if (!checkPackageContentUI.isFinishing() && !checkPackageContentUI.isDestroyed()) {
            com.tencent.wechat.aff.affroam.f fVar = this.f474653e;
            int i17 = 0;
            boolean z17 = fVar == null;
            java.lang.String str = checkPackageContentUI.f92799e;
            if (z17) {
                com.tencent.mars.xlog.Log.w(str, "Get Restore Conversation Failed!");
                java.lang.String string = checkPackageContentUI.getString(com.tencent.mm.R.string.mvj);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.a7(checkPackageContentUI, string, null, checkPackageContentUI.getString(com.tencent.mm.R.string.aby), new zo1.i0(checkPackageContentUI));
            } else {
                if (checkPackageContentUI.f92811t) {
                    android.widget.LinearLayout linearLayout = checkPackageContentUI.f92801g;
                    if (linearLayout == null) {
                        kotlin.jvm.internal.o.o("mainContentLl");
                        throw null;
                    }
                    linearLayout.setVisibility(0);
                    checkPackageContentUI.c7().setVisibility(8);
                    checkPackageContentUI.f92811t = false;
                }
                java.util.ArrayList newItems = checkPackageContentUI.f92812u;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = newItems.iterator();
                while (it.hasNext()) {
                    zo1.s sVar = (zo1.s) it.next();
                    java.lang.String str2 = sVar.f474762c ? sVar.f474760a : null;
                    if (str2 != null) {
                        hashSet.add(str2);
                    }
                }
                newItems.clear();
                java.util.LinkedList linkedList = fVar.f215824d;
                kotlin.jvm.internal.o.f(linkedList, "getConversationId(...)");
                int i18 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str3 = (java.lang.String) obj;
                    kotlin.jvm.internal.o.d(str3);
                    java.lang.Object obj2 = fVar.f215825e.get(i18);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    newItems.add(new zo1.s(str3, ((java.lang.Number) obj2).longValue(), hashSet.contains(str3)));
                    i18 = i19;
                }
                android.widget.Spinner spinner = checkPackageContentUI.f92802h;
                if (spinner == null) {
                    kotlin.jvm.internal.o.o("typeSpinner");
                    throw null;
                }
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.Z6(checkPackageContentUI, newItems, spinner.getSelectedItemPosition());
                zo1.w wVar = checkPackageContentUI.f92807p;
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("conversationAdapter");
                    throw null;
                }
                kotlin.jvm.internal.o.g(newItems, "newItems");
                wVar.f474805e = newItems;
                if (!newItems.isEmpty()) {
                    java.util.Iterator it6 = newItems.iterator();
                    while (it6.hasNext()) {
                        if (((zo1.s) it6.next()).f474762c && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
                wVar.f474806f = i17;
                wVar.notifyDataSetChanged();
                com.tencent.mars.xlog.Log.i(str, "loadDataImpl done");
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = checkPackageContentUI.f92810s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            checkPackageContentUI.f92810s = null;
        }
        return jz5.f0.f302826a;
    }
}
