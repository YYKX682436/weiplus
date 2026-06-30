package df2;

/* loaded from: classes3.dex */
public final class yj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f231872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f231873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(df2.pk pkVar, java.util.List list) {
        super(1);
        this.f231872d = pkVar;
        this.f231873e = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            df2.pk r0 = r9.f231872d
            androidx.viewpager.widget.ViewPager r1 = r0.f231085y
            r2 = 0
            if (r1 == 0) goto L10
            r1.setCurrentItem(r10, r2)
        L10:
            r1 = 1
            if (r10 < 0) goto L29
            java.util.List r3 = r9.f231873e
            int r4 = r3.size()
            if (r10 >= r4) goto L29
            java.lang.Object r3 = r3.get(r10)
            ce2.e r3 = (ce2.e) r3
            ce2.d r3 = r3.f40778a
            ce2.d r4 = ce2.d.f40776e
            if (r3 != r4) goto L29
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 == 0) goto L90
            ce2.i r3 = r0.f231072J
            r4 = 0
            if (r3 == 0) goto L36
            java.lang.String r3 = r3.t0()
            goto L37
        L36:
            r3 = r4
        L37:
            java.util.ArrayList r5 = r0.c7()
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r5.next()
            r7 = r6
            android.view.View r7 = (android.view.View) r7
            int r7 = r7.getId()
            r8 = 2131302353(0x7f0917d1, float:1.822279E38)
            if (r7 != r8) goto L57
            r7 = r1
            goto L58
        L57:
            r7 = r2
        L58:
            if (r7 == 0) goto L3f
            r4 = r6
        L5b:
            android.view.View r4 = (android.view.View) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "selectCustomText index:"
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = ", customTextDisabledName:"
            r1.append(r10)
            r1.append(r3)
            java.lang.String r10 = ",customTextTipsView:"
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = r0.f231073m
            com.tencent.mars.xlog.Log.i(r1, r10)
            if (r4 == 0) goto L90
            ce2.i r10 = r0.f231072J
            if (r10 == 0) goto L8b
            java.lang.String r10 = r10.A0()
            goto L8d
        L8b:
            java.lang.String r10 = ""
        L8d:
            r0.g7(r4, r3, r10)
        L90:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.yj.invoke(java.lang.Object):java.lang.Object");
    }
}
