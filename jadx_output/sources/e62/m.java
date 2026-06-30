package e62;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public l52.j f249774a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f249775b;

    /* renamed from: c, reason: collision with root package name */
    public e62.f f249776c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f249777d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f249778e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f249779f;

    /* renamed from: g, reason: collision with root package name */
    public final yj0.d f249780g = new e62.k(this);

    /* renamed from: h, reason: collision with root package name */
    public final yj0.b f249781h = new e62.l(this);

    public m() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f249779f = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onScrollStateChanged", "(Landroid/widget/AbsListView;I)V"));
        arrayList.add(android.util.Pair.create("onScroll", "(Landroid/widget/AbsListView;III)V"));
        new java.util.HashMap();
        hashMap.put("android/widget/AbsListView$OnScrollListener", arrayList);
        this.f249775b = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("resetStoryHeader", "()V"));
        hashMap.put("com/tencent/mm/plugin/sns/ui/SnsUIAction", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f249777d = arrayList3;
        arrayList3.add(android.util.Pair.create("smoothScrollToPosition", "(I)V"));
        arrayList3.add(android.util.Pair.create("smoothScrollToPositionFromTop", "(II)V"));
        arrayList3.add(android.util.Pair.create("scrollToPositionWithOffset", "(II)V"));
        arrayList3.add(android.util.Pair.create("scrollToPosition", "(I)V"));
        arrayList3.add(android.util.Pair.create("smoothScrollToPosition", "(I)V"));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f249778e = hashMap2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("scrollToTop", "(Landroid/widget/ListView;)V"));
        hashMap2.put("com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory", arrayList4);
    }
}
