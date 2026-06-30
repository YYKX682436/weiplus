package dp;

/* loaded from: classes15.dex */
public final /* synthetic */ class a$$a implements dp.e {
    public final void a(android.content.Context context, java.lang.CharSequence charSequence, android.view.View view, dp.d dVar, dp.c cVar, int i17) {
        android.widget.Toast toast = new android.widget.Toast(context);
        toast.setDuration(i17);
        if (view != null) {
            toast.setView(view);
        } else {
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(charSequence);
            toast.setView(textView);
        }
        if (dVar != null) {
            toast.setGravity(dVar.f242103a, dVar.f242104b, dVar.f242105c);
        }
        if (cVar != null) {
            toast.setMargin(cVar.f242102b, cVar.f242101a);
        }
        toast.show();
    }
}
