package ry4;

/* loaded from: classes.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f401623d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f401624e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f401625f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f401626g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.q f401627h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.g1 f401628i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f401629m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f401630n;

    /* renamed from: o, reason: collision with root package name */
    public int f401631o;

    public g(java.util.List items, boolean z17, yz5.p onItemClick, yz5.l onSelectionChanged, yz5.q qVar) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        kotlin.jvm.internal.o.g(onSelectionChanged, "onSelectionChanged");
        this.f401623d = items;
        this.f401624e = z17;
        this.f401625f = onItemClick;
        this.f401626g = onSelectionChanged;
        this.f401627h = qVar;
        this.f401630n = new java.util.LinkedHashSet();
    }

    public final void B(android.widget.TextView textView, java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        android.content.Context context = textView.getContext();
        int color = context.getResources().getColor(com.tencent.mm.R.color.FG_2, context.getTheme());
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.FG_0, context.getTheme());
        int i17 = 0;
        while (i17 < str.length()) {
            int codePointAt = str.codePointAt(i17);
            int charCount = java.lang.Character.charCount(codePointAt);
            boolean z17 = true;
            if (!(128512 <= codePointAt && codePointAt < 128592)) {
                if (!(127744 <= codePointAt && codePointAt < 128512)) {
                    if (!(128640 <= codePointAt && codePointAt < 128768)) {
                        if (!(129280 <= codePointAt && codePointAt < 129536)) {
                            if (!(9728 <= codePointAt && codePointAt < 9984)) {
                                if (!(9984 <= codePointAt && codePointAt < 10176)) {
                                    if (!(65024 <= codePointAt && codePointAt < 65040)) {
                                        if (!(129536 <= codePointAt && codePointAt < 129648)) {
                                            if (!(129648 <= codePointAt && codePointAt < 129792)) {
                                                if (!(8986 <= codePointAt && codePointAt < 8988)) {
                                                    if (!(9642 <= codePointAt && codePointAt < 9644)) {
                                                        if (!(9723 <= codePointAt && codePointAt < 9727)) {
                                                            if (!(9748 <= codePointAt && codePointAt < 9750)) {
                                                                z17 = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z17) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color2), i17, i17 + charCount, 33);
            } else {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), i17, i17 + charCount, 33);
            }
            i17 += charCount;
        }
        textView.setText(spannableString);
    }

    public final void E(android.view.View view, int i17, int i18, int i19) {
        boolean z17;
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        boolean z18 = true;
        if (layoutParams2.width != i17) {
            layoutParams2.width = i17;
            z17 = true;
        } else {
            z17 = false;
        }
        if (layoutParams2.getMarginStart() != i18) {
            layoutParams2.setMarginStart(i18);
            z17 = true;
        }
        if (layoutParams2.getMarginEnd() != i19) {
            layoutParams2.setMarginEnd(i19);
        } else {
            z18 = z17;
        }
        if (z18) {
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f401623d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ehh, parent, false);
        if (this.f401631o == 0) {
            this.f401631o = parent.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        }
        kotlin.jvm.internal.o.d(inflate);
        return new ry4.a(inflate);
    }

    public final void x(ry4.a aVar) {
        if (this.f401624e) {
            android.content.Context context = aVar.itemView.getContext();
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478520a84, context.getTheme());
            android.widget.TextView textView = aVar.f401566d;
            if (textView != null) {
                textView.setTextColor(color);
            }
            android.widget.TextView textView2 = aVar.f401567e;
            if (textView2 != null) {
                textView2.setTextColor(color);
            }
        }
    }

    public final void y(ry4.a aVar, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, int i17) {
        if (this.f401629m) {
            android.widget.CheckBox checkBox = aVar.f401568f;
            if (checkBox != null) {
                checkBox.setChecked(this.f401630n.contains(java.lang.Integer.valueOf(i17)));
            }
            aVar.itemView.setOnClickListener(new ry4.b(aVar, this));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = aVar.f401569g;
            if (weImageView != null) {
                weImageView.setOnClickListener(new ry4.c(aVar, this));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = aVar.f401570h;
            if (weImageView2 != null) {
                weImageView2.setOnLongClickListener(new ry4.d(this, aVar));
            }
            aVar.itemView.setOnLongClickListener(null);
            return;
        }
        android.widget.CheckBox checkBox2 = aVar.f401568f;
        if (checkBox2 != null) {
            checkBox2.setChecked(false);
        }
        aVar.itemView.setOnClickListener(new ry4.e(this, shortcutCommandItem, i17));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = aVar.f401569g;
        if (weImageView3 != null) {
            weImageView3.setOnClickListener(null);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = aVar.f401570h;
        if (weImageView4 != null) {
            weImageView4.setOnLongClickListener(null);
        }
        if (this.f401624e || this.f401627h == null) {
            aVar.itemView.setOnLongClickListener(null);
        } else {
            aVar.itemView.setOnLongClickListener(new ry4.f(aVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ry4.a holder, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) this.f401623d.get(i17);
        android.widget.TextView textView = holder.f401566d;
        if (textView != null) {
            textView.setText(shortcutCommandItem.a());
        }
        android.widget.TextView textView2 = holder.f401567e;
        if (textView2 != null) {
            textView2.setVisibility(0);
            B(textView2, !com.tencent.mm.sdk.platformtools.t8.K0(shortcutCommandItem.f188080e) ? shortcutCommandItem.c() : shortcutCommandItem.a());
        }
        x(holder);
        boolean z18 = this.f401629m;
        int dimensionPixelSize = z18 ? holder.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz) : 0;
        android.widget.CheckBox checkBox = holder.f401568f;
        E(checkBox, dimensionPixelSize, 0, 0);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f401569g;
        E(weImageView, dimensionPixelSize, 0, 0);
        int dimensionPixelSize2 = z18 ? holder.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs) : 0;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = holder.f401570h;
        E(weImageView2, dimensionPixelSize, dimensionPixelSize2, 0);
        int dimensionPixelSize3 = z18 ? holder.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : 0;
        int dimensionPixelSize4 = z18 ? holder.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : 0;
        android.view.View view = holder.f401572m;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                boolean z19 = true;
                if (layoutParams2.getMarginStart() != dimensionPixelSize3) {
                    layoutParams2.setMarginStart(dimensionPixelSize3);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (layoutParams2.getMarginEnd() != dimensionPixelSize4) {
                    layoutParams2.setMarginEnd(dimensionPixelSize4);
                } else {
                    z19 = z17;
                }
                if (z19) {
                    view.setLayoutParams(layoutParams2);
                }
            }
        }
        int dimensionPixelSize5 = z18 ? holder.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : 0;
        android.view.View view2 = holder.f401571i;
        if (view2 != null && view2.getPaddingEnd() != dimensionPixelSize5) {
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), dimensionPixelSize5, view2.getPaddingBottom());
        }
        if (z18) {
            if (checkBox != null) {
                checkBox.setVisibility(0);
            }
            if (checkBox != null) {
                checkBox.setTranslationX(0.0f);
            }
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView != null) {
                weImageView.setTranslationX(0.0f);
            }
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            if (weImageView2 != null) {
                weImageView2.setTranslationX(0.0f);
            }
        } else {
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            if (checkBox != null) {
                checkBox.setTranslationX(0.0f);
            }
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            if (weImageView != null) {
                weImageView.setTranslationX(0.0f);
            }
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
            if (weImageView2 != null) {
                weImageView2.setTranslationX(0.0f);
            }
        }
        y(holder, shortcutCommandItem, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        android.widget.CheckBox checkBox;
        ry4.a holder = (ry4.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) this.f401623d.get(i17);
        android.widget.TextView textView = holder.f401566d;
        if (textView != null) {
            textView.setText(shortcutCommandItem.a());
        }
        android.widget.TextView textView2 = holder.f401567e;
        if (textView2 != null) {
            textView2.setVisibility(0);
            B(textView2, !com.tencent.mm.sdk.platformtools.t8.K0(shortcutCommandItem.f188080e) ? shortcutCommandItem.c() : shortcutCommandItem.a());
        }
        x(holder);
        y(holder, shortcutCommandItem, i17);
        if (!payloads.contains("PAYLOAD_SELECTION") || (checkBox = holder.f401568f) == null) {
            return;
        }
        checkBox.setChecked(this.f401630n.contains(java.lang.Integer.valueOf(i17)));
    }
}
