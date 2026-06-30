package gg2;

/* loaded from: classes2.dex */
public final class y extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f271725b = "MicroMsg.LiveExpTwentySevenItem";
    }

    @Override // gg2.b
    public java.lang.Object a(android.view.View view, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        view.setOnClickListener(new gg2.x(this));
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.f484254t94);
        if (mMNeat7extView == null) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String l17 = l();
        int n17 = n();
        android.content.Context context = mMNeat7extView.getContext();
        boolean z18 = false;
        if ((l17.length() == 0) && n17 == 0) {
            mMNeat7extView.setVisibility(8);
        } else {
            boolean z19 = l17.length() == 0;
            com.tencent.mm.plugin.finder.feed.ui.h2 h2Var = com.tencent.mm.plugin.finder.feed.ui.h2.f110102a;
            tc2.g gVar = this.f271664a;
            if (z19 && h2Var.b(context, gVar.f417148h) == null) {
                mMNeat7extView.setVisibility(8);
            } else {
                com.tencent.mars.xlog.Log.i(this.f271725b, "initHighlightSummaryView, showType: " + n17 + ", content: " + r26.p0.E0(l17, 50));
                if (n17 == 1) {
                    com.tencent.mm.plugin.finder.feed.ui.sq b17 = h2Var.b(context, gVar.f417148h);
                    r45.iw1 m17 = m();
                    if (m17 == null) {
                        z17 = false;
                    } else {
                        java.lang.String string = m17.getString(0);
                        z17 = !(string == null || string.length() == 0);
                    }
                    if (z17) {
                        java.lang.String string2 = context.getString(com.tencent.mm.R.string.orz);
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        l17 = string2.concat(l17);
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(l17);
                    if (b17 != null) {
                        spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                        spannableStringBuilder.setSpan(b17, 0, 1, 17);
                    }
                    mMNeat7extView.b(new android.text.SpannableString(spannableStringBuilder));
                    mMNeat7extView.setVisibility(0);
                } else {
                    java.lang.String string3 = context.getString(com.tencent.mm.R.string.f493720os0);
                    com.tencent.mm.plugin.finder.feed.ui.sq sqVar = null;
                    if (!(string3 == null || string3.length() == 0)) {
                        android.graphics.Bitmap bitmap = com.tencent.mm.plugin.finder.feed.ui.h2.f110105d;
                        if (bitmap == null) {
                            com.tencent.mars.xlog.Log.i("FinderFeedLivingTag", "getTalkingTagSpan create bitmap, text: " + string3);
                            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e_c, (android.view.ViewGroup) null);
                            if (inflate != null) {
                                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nxa);
                                if (textView != null) {
                                    textView.setText(string3);
                                }
                                inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
                                int measuredWidth = inflate.getMeasuredWidth();
                                int measuredHeight = inflate.getMeasuredHeight();
                                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(config);
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(java.lang.Integer.valueOf(measuredHeight));
                                arrayList.add(java.lang.Integer.valueOf(measuredWidth));
                                java.lang.Object obj = new java.lang.Object();
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getTalkingTagSpan", "(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getTalkingTagSpan", "(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                com.tencent.mm.plugin.finder.feed.ui.h2.f110105d = createBitmap;
                                if (createBitmap != null) {
                                    inflate.draw(new android.graphics.Canvas(createBitmap));
                                    sqVar = new com.tencent.mm.plugin.finder.feed.ui.sq(context, createBitmap);
                                }
                            }
                        } else {
                            sqVar = new com.tencent.mm.plugin.finder.feed.ui.sq(context, bitmap);
                        }
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(l17);
                    if (sqVar != null) {
                        spannableStringBuilder2.insert(0, (java.lang.CharSequence) " ");
                        spannableStringBuilder2.setSpan(sqVar, 0, 1, 17);
                    }
                    mMNeat7extView.b(new android.text.SpannableString(spannableStringBuilder2));
                    mMNeat7extView.setVisibility(0);
                }
                z18 = true;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }

    @Override // gg2.b
    public int c() {
        return com.tencent.mm.R.layout.e_g;
    }

    @Override // gg2.b
    public int e() {
        return 5;
    }

    @Override // gg2.b
    public java.lang.String f() {
        r45.iw1 m17 = m();
        java.lang.String string = m17 != null ? m17.getString(0) : null;
        return string == null ? "" : string;
    }

    @Override // gg2.b
    public int g() {
        return 27;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f271725b;
    }

    @Override // gg2.b
    public boolean j(gg2.b other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof gg2.y) {
            return kotlin.jvm.internal.o.b(l(), ((gg2.y) other).l());
        }
        return false;
    }

    public final java.lang.String l() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        android.text.SpannableString descriptionSpan;
        java.lang.String spannableString;
        r45.iw1 m17 = m();
        java.lang.String string = m17 != null ? m17.getString(0) : null;
        boolean z17 = string == null || string.length() == 0;
        java.lang.String str = "";
        java.lang.String str2 = this.f271725b;
        if (!z17) {
            kotlin.jvm.internal.o.d(m17);
            long integer = m17.getInteger(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("display highlight summary, content: ");
            java.lang.String string2 = m17.getString(0);
            sb6.append(string2 != null ? r26.p0.E0(string2, 50) : null);
            sb6.append(", createTime: ");
            sb6.append(integer);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            java.lang.String string3 = m17.getString(0);
            return string3 == null ? "" : string3;
        }
        if (n() != 1) {
            com.tencent.mars.xlog.Log.i(str2, "no highlight summary and no fallback");
            return "";
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f271664a.f417148h;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null && (spannableString = descriptionSpan.toString()) != null) {
            str = spannableString;
        }
        com.tencent.mars.xlog.Log.i(str2, "no highlight summary, fallback to description: ".concat(r26.p0.E0(str, 50)));
        return str;
    }

    public final r45.iw1 m() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f271664a.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) {
            return null;
        }
        return (r45.iw1) liveInfo.getCustom(81);
    }

    public final int n() {
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.wg6 wg6Var;
        r45.kr0 h17 = h();
        if (h17 == null || (list = h17.getList(12)) == null) {
            return 0;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.kz3) obj).getInteger(0) == 27) {
                break;
            }
        }
        r45.kz3 kz3Var = (r45.kz3) obj;
        if (kz3Var == null || (wg6Var = (r45.wg6) kz3Var.getCustom(18)) == null) {
            return 0;
        }
        return wg6Var.getInteger(1);
    }
}
