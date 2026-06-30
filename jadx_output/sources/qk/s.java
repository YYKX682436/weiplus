package qk;

/* loaded from: classes10.dex */
public abstract class s extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public qk.y7 f364327d;

    public s(android.content.Context context) {
        super(context);
        this.f364327d = new qk.r(this);
    }

    public qk.y7 getSelectedFeatureListener() {
        return this.f364327d;
    }

    public abstract void setActionBarCallback(qk.i6 i6Var);

    public abstract void setActionBarVisible(boolean z17);

    public abstract void setAutoShowFooterAndBar(boolean z17);

    public abstract void setFooterVisible(boolean z17);

    public void setSelectedFeatureListener(qk.y7 y7Var) {
        this.f364327d = y7Var;
    }
}
