package lu2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final lu2.j f321376a = new lu2.j();

    public static /* synthetic */ void b(lu2.j jVar, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        jVar.a(context, str, str2);
    }

    public static com.tencent.mm.ui.widget.dialog.j0 c(lu2.j jVar, android.content.Context context, java.util.List dataList, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnClickListener onClickListener3, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = "Stream信息";
        }
        java.lang.String title = str;
        if ((i17 & 8) != 0) {
            onClickListener = null;
        }
        if ((i17 & 16) != 0) {
            onClickListener2 = null;
        }
        if ((i17 & 32) != 0) {
            onClickListener3 = null;
        }
        jVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(title, "title");
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        recyclerView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        lu2.b bVar = new lu2.b(dataList, onClickListener3);
        recyclerView.setAdapter(bVar);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.ui.widget.dialog.j0 r17 = db5.e1.r(context, title, recyclerView, "Close", "Cancel", onClickListener == null ? lu2.h.f321374d : onClickListener, onClickListener2 == null ? lu2.i.f321375d : onClickListener2);
        bVar.f321365f = r17;
        kotlin.jvm.internal.o.d(r17);
        return r17;
    }

    public final void a(android.content.Context context, java.lang.String txt, java.lang.String extraCopyMsg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(txt, "txt");
        kotlin.jvm.internal.o.g(extraCopyMsg, "extraCopyMsg");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(txt);
        textView.setGravity(3);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        lu2.e eVar = new lu2.e(txt, extraCopyMsg, context);
        lu2.d dVar = lu2.d.f321367d;
        com.tencent.mars.xlog.Log.i("MicroMsg.DebugDialog", "dialog msg ".concat(txt));
        db5.e1.r(context, "视频号测试", textView, "copy", "cancel", eVar, dVar);
    }
}
