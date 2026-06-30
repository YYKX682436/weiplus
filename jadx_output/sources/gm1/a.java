package gm1;

/* loaded from: classes7.dex */
public final class a implements android.content.DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f273305a;

    public a(boolean[] zArr) {
        this.f273305a = zArr;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17, boolean z17) {
        this.f273305a[i17] = z17;
    }
}
