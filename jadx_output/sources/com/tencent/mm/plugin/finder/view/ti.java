package com.tencent.mm.plugin.finder.view;

/* loaded from: classes4.dex */
public final class ti {
    public ti(kotlin.jvm.internal.i iVar) {
    }

    public final android.view.View a(android.content.Context context, r45.ev2 collection, java.lang.String tail) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collection, "collection");
        kotlin.jvm.internal.o.g(tail, "tail");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.eny, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484981tw0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484443tc4);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.tco);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tf_);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l.f460502a.h(collection.getString(3), imageView, mn2.f1.B);
        textView.setText(collection.getString(1));
        textView3.setText(tail);
        textView2.setText(context.getString(com.tencent.mm.R.string.etp, java.lang.Integer.valueOf(collection.getInteger(4))));
        return inflate;
    }
}
