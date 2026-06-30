package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes7.dex */
public final class ye extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f206079b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f206080c;

    public final com.tencent.mm.ui.chatting.viewitems.ye a(android.view.View convertView) {
        kotlin.jvm.internal.o.g(convertView, "convertView");
        super.create(convertView);
        if (z65.c.a()) {
            this.f206080c = (android.widget.TextView) convertView.findViewById(com.tencent.mm.R.id.fsj);
        }
        this.f206079b = (androidx.constraintlayout.widget.ConstraintLayout) convertView.findViewById(com.tencent.mm.R.id.d18);
        return this;
    }
}
