package com.tencent.mm.ui.conversation.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/conversation/adapter/MvvmConvList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lyf5/x;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "initList", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;Ljava/util/List;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MvvmConvList extends com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MvvmConvList(ym3.f dataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner, java.util.List<? extends yf5.x> initList) {
        super(dataSource, config, lifecycleOwner, null, initList, 8, null);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(initList, "initList");
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.lang.String c() {
        return "MicroMsg.mvvm.ConversationList";
    }
}
