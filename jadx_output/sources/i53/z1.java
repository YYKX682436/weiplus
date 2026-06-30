package i53;

/* loaded from: classes8.dex */
public class z1 extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f288803i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f288804m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(i53.a2 a2Var, androidx.fragment.app.FragmentManager fragmentManager, java.util.LinkedList linkedList) {
        super(fragmentManager, 0);
        this.f288804m = a2Var;
        this.f288803i = linkedList;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f288803i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return new com.tencent.mm.plugin.game.media.GameRecommendVideoFragment((p33.e0) this.f288803i.get(i17), i17, this.f288804m.f288509t);
    }
}
