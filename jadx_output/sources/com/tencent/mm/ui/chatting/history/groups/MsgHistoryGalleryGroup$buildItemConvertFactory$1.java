package com.tencent.mm.ui.chatting.history.groups;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/ui/chatting/history/groups/MsgHistoryGalleryGroup$buildItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryGroup$buildItemConvertFactory$1 implements in5.s {
    final /* synthetic */ com.tencent.mm.ui.chatting.history.groups.g this$0;

    public MsgHistoryGalleryGroup$buildItemConvertFactory$1(com.tencent.mm.ui.chatting.history.groups.g gVar) {
        this.this$0 = gVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == -2) {
            return new uc5.n0();
        }
        if (type == -1) {
            return new uc5.g0();
        }
        if (type == 0) {
            return new uc5.o0();
        }
        for (uc5.p pVar : this.this$0.c()) {
            java.lang.Class clazz = pVar.c();
            kotlin.jvm.internal.o.g(clazz, "clazz");
            if (clazz.getName().hashCode() == type) {
                return new uc5.q(pVar.d());
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
