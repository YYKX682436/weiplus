package db5;

/* loaded from: classes15.dex */
public abstract class z8 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final db5.y8 f228597d;

    public z8() {
        db5.y8 y8Var = new db5.y8();
        this.f228597d = y8Var;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        y8Var.f228587d = 1;
        y8Var.f228588e = sparseArray;
        y8Var.f228586c = new android.util.SparseArray[]{sparseArray};
    }

    @Override // androidx.viewpager.widget.a
    public final void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        db5.y8 y8Var = this.f228597d;
        if (y8Var.f228587d == 1) {
            y8Var.f228588e.put(i17, view);
        } else {
            y8Var.f228586c[0].put(i17, view);
        }
        view.setAccessibilityDelegate(null);
    }

    @Override // androidx.viewpager.widget.a
    public final java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        android.view.View a17;
        i12.b0 b0Var;
        java.lang.String str;
        java.lang.String str2;
        db5.y8 y8Var = this.f228597d;
        android.view.View view = null;
        if (y8Var.f228587d == 1) {
            a17 = db5.y8.a(y8Var.f228588e, i17);
        } else {
            android.util.SparseArray[] sparseArrayArr = y8Var.f228586c;
            a17 = sparseArrayArr.length > 0 ? db5.y8.a(sparseArrayArr[0], i17) : null;
        }
        i12.c0 c0Var = (i12.c0) this;
        java.util.LinkedList linkedList = c0Var.f287195e;
        if (linkedList != null) {
            int size = i17 % linkedList.size();
            android.content.Context context = c0Var.f287196f;
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "getView inflate");
                a17 = android.view.View.inflate(context, com.tencent.mm.R.layout.a8b, null);
                b0Var = new i12.b0(c0Var, a17);
                a17.setTag(b0Var);
            } else {
                b0Var = (i12.b0) a17.getTag();
                int i18 = com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.a(context)[0];
                b0Var.f287168a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i18, ((i18 * 3) / 8) + 1));
            }
            a17.setTag(com.tencent.mm.R.id.dbf, java.lang.Integer.valueOf(size));
            a17.setOnClickListener(c0Var);
            com.tencent.mm.plugin.emoji.model.b bVar = (com.tencent.mm.plugin.emoji.model.b) linkedList.get(size);
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "BaseEmotionBanner is null.");
            } else {
                if (bVar.f97539c) {
                    r45.kj0 kj0Var = bVar.f97537a;
                    str = kj0Var.f378726d.f377094g;
                    str2 = com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378728f) ? "H5" : "Toptic";
                } else {
                    r45.hj0 hj0Var = bVar.f97538b;
                    str = hj0Var.f376211e.f377094g;
                    str2 = hj0Var.f376210d.f392128d;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.storage.emotion.EmojiInfo e17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.e(str2, 8, str, i65.a.g(context), true);
                    com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView storeBannerEmojiView = b0Var.f287168a;
                    if (e17 == null) {
                        java.util.ArrayList arrayList = c0Var.f287199i;
                        if (arrayList.contains(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "url has add to list. no need to try load image.");
                            storeBannerEmojiView.setImageFilePath("-");
                        } else {
                            n11.a.b().j(str, null, y12.f.c(str2, str, false, str2, "BANNER"), c0Var.f287200m);
                            arrayList.add(str);
                        }
                    } else {
                        storeBannerEmojiView.setImageFilePath(e17.N0());
                    }
                }
                view = a17;
            }
        }
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        db5.y8 y8Var = this.f228597d;
        boolean z17 = y8Var.f228587d > 1;
        android.util.SparseArray sparseArray = y8Var.f228588e;
        android.view.View[] viewArr = y8Var.f228584a;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            android.view.View view = viewArr[length];
            if (view != null) {
                int[] iArr = y8Var.f228585b;
                int i17 = iArr[length];
                viewArr[length] = null;
                iArr[length] = -1;
                if (i17 >= 0) {
                    if (z17) {
                        sparseArray = y8Var.f228586c[i17];
                    }
                    sparseArray.put(length, view);
                    view.setAccessibilityDelegate(null);
                }
            }
        }
        int length2 = viewArr.length;
        int i18 = y8Var.f228587d;
        android.util.SparseArray[] sparseArrayArr = y8Var.f228586c;
        for (int i19 = 0; i19 < i18; i19++) {
            android.util.SparseArray sparseArray2 = sparseArrayArr[i19];
            int size = sparseArray2.size();
            int i27 = size - length2;
            int i28 = size - 1;
            int i29 = 0;
            while (i29 < i27) {
                sparseArray2.remove(sparseArray2.keyAt(i28));
                i29++;
                i28--;
            }
        }
        super.notifyDataSetChanged();
    }
}
