package ie;

/* loaded from: classes7.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ie.d f290951d;

    public a(ie.d dVar) {
        this.f290951d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f290951d.G;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
