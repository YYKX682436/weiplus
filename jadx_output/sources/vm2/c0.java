package vm2;

/* loaded from: classes3.dex */
public final class c0 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.ArrayList dataList) {
        super(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.widget.adapters.LiveMemberOptionAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new vm2.a0();
            }
        }, dataList, false);
        kotlin.jvm.internal.o.g(dataList, "dataList");
    }
}
