package ry2;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f401495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f401496e;

    public u(ry2.y yVar, java.util.ArrayList arrayList) {
        this.f401495d = yVar;
        this.f401496e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String i17;
        android.graphics.Bitmap J2;
        ry2.y yVar = this.f401495d;
        java.util.ArrayList arrayList = yVar.f401511v;
        kotlin.jvm.internal.o.d(arrayList);
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String file = (java.lang.String) obj;
            boolean z17 = i18 == 0;
            kotlin.jvm.internal.o.g(file, "file");
            java.util.ArrayList arrayList2 = yVar.f401512w;
            kotlin.jvm.internal.o.d(arrayList2);
            java.lang.Integer num = (java.lang.Integer) arrayList2.get(i18);
            java.util.ArrayList arrayList3 = this.f401496e;
            if (num != null && num.intValue() == 2) {
                if (arrayList3 == null || arrayList3.size() <= i18 || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) arrayList3.get(i18))) {
                    i17 = mv2.q.f331618a.e(file, null);
                } else {
                    java.lang.Object obj2 = arrayList3.get(i18);
                    kotlin.jvm.internal.o.d(obj2);
                    i17 = (java.lang.String) obj2;
                }
            } else if (arrayList3 == null || arrayList3.size() <= i18 || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) arrayList3.get(i18)) || !com.tencent.mm.vfs.w6.j((java.lang.String) arrayList3.get(i18))) {
                java.util.ArrayList arrayList4 = yVar.f401514y;
                if (arrayList4.size() > i18 && arrayList4.get(i18) != null) {
                    java.lang.Object obj3 = arrayList4.get(i18);
                    kotlin.jvm.internal.o.d(obj3);
                    if (((r45.c07) ((r45.dd4) obj3).getCustom(6)) != null) {
                        mv2.q qVar = mv2.q.f331618a;
                        java.lang.Object obj4 = arrayList4.get(i18);
                        kotlin.jvm.internal.o.d(obj4);
                        r45.c07 c07Var = (r45.c07) ((r45.dd4) obj4).getCustom(6);
                        kotlin.jvm.internal.o.d(c07Var);
                        i17 = qVar.j(file, c07Var);
                    }
                }
                com.tencent.mars.xlog.Log.w("Finder.PostMixMediaWidget", "no thumb & no thumbRect");
                i17 = mv2.q.f331618a.i(file);
            } else {
                java.lang.Object obj5 = arrayList3.get(i18);
                kotlin.jvm.internal.o.d(obj5);
                i17 = (java.lang.String) obj5;
            }
            java.lang.String thumbFile = i17;
            kotlin.jvm.internal.o.g(thumbFile, "thumbFile");
            com.tencent.mars.xlog.Log.i("Finder.PostMixMediaWidget", "showVideoThumb, thumbFile:" + thumbFile + ", showThumb:" + z17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(thumbFile) && (J2 = com.tencent.mm.sdk.platformtools.x.J(thumbFile, null)) != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new ry2.x(yVar, thumbFile, z17, J2, J2));
            }
            if (z17) {
                android.widget.ImageView imageView = yVar.f401508s;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("videoPlayIcon");
                    throw null;
                }
                imageView.setVisibility(8);
            }
            i18 = i19;
        }
    }
}
