package l45;

/* loaded from: classes10.dex */
public class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f316439a;

    public d(l45.n nVar) {
        this.f316439a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f316439a;
        android.widget.EditText editText = (android.widget.EditText) nVar.f316460a.getTextEditView().findViewById(com.tencent.mm.R.id.o4a);
        editText.requestFocus();
        editText.setSelection(editText.length());
        nVar.f316460a.getSelectedFeatureListener().c(true);
        ((com.tencent.mm.view.footer.SelectColorBar) nVar.f316460a.findViewById(com.tencent.mm.R.id.mii)).setSelectColor(editText.getCurrentTextColor());
        nVar.f316460a.getActionBar().post(new l45.c(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
