package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLiveNormalOccupyUI5;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/g8", "com/tencent/mm/plugin/finder/ui/h8", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveNormalOccupyUI5 extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int E = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f128599t = "https://wxapp.tc.qq.com/251/20304/stodownload?m=d1e396e04e11adf78c4fab81c8eb5c65&filekey=30340201010420301e020200fb040253480410d1e396e04e11adf78c4fab81c8eb5c650202501b040d00000004627466730000000132&hy=SH&storeid=161aa14b40001c60a00000000000000fb00004f50534813d6db40b6620efed&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f128600u = "https://wxapp.tc.qq.com/251/20304/stodownload?m=6c5df5ba07a31cdef08fb41e719e61b2&filekey=30340201010420301e020200fb0402534804106c5df5ba07a31cdef08fb41e719e61b20202723c040d00000004627466730000000132&hy=SH&storeid=5626a3c7100018e4000000000000000fb00004f50534829a34b00b63f4f269&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f128601v = "https://wxapp.tc.qq.com/251/20304/stodownload?m=1362d4dc5a1a965d26f6fc5a981abcff&filekey=30340201010420301e020200fb0402534804101362d4dc5a1a965d26f6fc5a981abcff02024fde040d00000004627466730000000132&hy=SH&storeid=56242be62000d55c500000000000000fb00004f5053481ec6db40b683982ec&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f128602w = "https://wxapp.tc.qq.com/251/20304/stodownload?m=d812f5e4cd1f89b0fbf1a19081c8b4ff&filekey=30340201010420301e020200fb040253480410d812f5e4cd1f89b0fbf1a19081c8b4ff02026bce040d00000004627466730000000132&hy=SH&storeid=563bcde740005507e00000000000000fb00004f505348026e0b01e6872b805&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f128603x = "https://wxapp.tc.qq.com/251/20304/stodownload?m=3251368bbed460fc551a385e0b4f48ab&filekey=30340201010420301e020200fb0402534804103251368bbed460fc551a385e0b4f48ab020276f9040d00000004627466730000000132&hy=SH&storeid=5626a3c03000318a100000000000000fb00004f50534815234b00b6342cc30&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f128604y = "https://wxapp.tc.qq.com/251/20304/stodownload?m=ae9e7ba5176b533c934288c15187aecb&filekey=30340201010420301e020200fb040253480410ae9e7ba5176b533c934288c15187aecb02025928040d00000004627466730000000132&hy=SH&storeid=161aa173a000a047900000000000000fb00004f5053482d36db40b646a8525&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f128605z = "https://wxapp.tc.qq.com/251/20304/stodownload?m=cb0d0300ab0038f45448e353c3e53e3d&filekey=30350201010421301f020200fb040253480410cb0d0300ab0038f45448e353c3e53e3d020300d17a040d00000004627466730000000132&hy=SH&storeid=161af495a00074aeb00000000000000fb00004f5053481bb68b40b6990b347&dotrans=0&bizid=1023&adaptivelytrans=0";
    public final java.lang.String A = "https://wxapp.tc.qq.com/251/20304/stodownload?m=99bef3c6947aa5d635cb283dc3554b86&filekey=30350201010421301f020200fb04025348041099bef3c6947aa5d635cb283dc3554b86020300e52e040d00000004627466730000000132&hy=SH&storeid=563775002000e18be00000000000000fb00004f5053481eb008e0b6bae6d4d&dotrans=0&bizid=1023&adaptivelytrans=0";
    public final com.tencent.mm.plugin.finder.ui.g8 B = new com.tencent.mm.plugin.finder.ui.g8(new java.util.LinkedList());
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.ui.m8(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.ui.k8(this));

    public FinderLiveNormalOccupyUI5() {
        jz5.h.b(new com.tencent.mm.plugin.finder.ui.l8(this));
        jz5.h.b(com.tencent.mm.plugin.finder.ui.j8.f129387d);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b4t;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.C).getValue()).setAdapter(this.B);
        ((android.view.View) ((jz5.n) this.D).getValue()).setOnClickListener(com.tencent.mm.plugin.finder.ui.i8.f129355d);
    }
}
