package g22;

/* loaded from: classes11.dex */
public final class a0 implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267794d;

    public a0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267794d = emojiStoreV3HomeUI;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.util.Objects.toString(iVar != null ? iVar.f343780c : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3.equals(r14) == true) goto L15;
     */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l4(oa.i r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI r0 = r13.f267794d
            java.util.List r1 = r0.f98443p
            if (r1 == 0) goto Lac
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 < 0) goto La7
            g22.v r4 = (g22.v) r4
            oa.i r3 = r4.f267877b
            if (r3 == 0) goto L28
            boolean r3 = r3.equals(r14)
            r6 = 1
            if (r3 != r6) goto L28
            goto L29
        L28:
            r6 = r2
        L29:
            if (r6 == 0) goto La4
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView r14 = r4.f267879d
            if (r14 == 0) goto L41
            androidx.appcompat.app.AppCompatActivity r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099880(0x7f0600e8, float:1.7812126E38)
            int r1 = r1.getColor(r3)
            r14.setTitleTextColor(r1)
        L41:
            android.view.View r14 = r4.f267880e
            if (r14 == 0) goto L57
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r0 = r0.getColor(r1)
            r14.setBackgroundColor(r0)
        L57:
            android.view.View r14 = r4.f267880e
            if (r14 != 0) goto L5c
            goto La3
        L5c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r6 = r0.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2"
            java.lang.String r8 = "onTabUnselected"
            java.lang.String r9 = "(Lcom/google/android/material/tabs/TabLayout$Tab;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r14
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r14.setVisibility(r0)
            java.lang.String r6 = "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2"
            java.lang.String r7 = "onTabUnselected"
            java.lang.String r8 = "(Lcom/google/android/material/tabs/TabLayout$Tab;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r14
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
        La3:
            return
        La4:
            r3 = r5
            goto Lc
        La7:
            kz5.c0.p()
            r14 = 0
            throw r14
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g22.a0.l4(oa.i):void");
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267794d;
        java.util.List list = emojiStoreV3HomeUI.f98443p;
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                g22.v vVar = (g22.v) obj;
                oa.i iVar2 = vVar.f267877b;
                if (iVar2 != null && iVar2.equals(iVar)) {
                    com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView = vVar.f267879d;
                    if (emojiStoreV3TabView != null) {
                        emojiStoreV3TabView.setTitleTextColor(emojiStoreV3HomeUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
                    }
                    android.view.View view = vVar.f267880e;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view2 = vVar.f267880e;
                    if (view2 != null) {
                        view2.setBackgroundColor(emojiStoreV3HomeUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
                    }
                    com.tencent.mm.ui.base.CustomViewPager customViewPager = emojiStoreV3HomeUI.f98442o;
                    if (customViewPager != null) {
                        customViewPager.setCurrentItem(i17, true);
                        return;
                    }
                    return;
                }
                i17 = i18;
            }
        }
    }
}
