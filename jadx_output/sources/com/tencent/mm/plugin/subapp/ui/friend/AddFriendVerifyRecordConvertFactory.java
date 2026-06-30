package com.tencent.mm.plugin.subapp.ui.friend;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B%\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lkotlin/Function2;", "Landroid/view/View;", "Lin5/c;", "", "onItemLongClickListener", "Lyz5/p;", "Leg4/y;", "headerConvert$delegate", "Ljz5/g;", "getHeaderConvert", "()Leg4/y;", "headerConvert", "Leg4/i0;", "newItemConvert$delegate", "getNewItemConvert", "()Leg4/i0;", "newItemConvert", "Leg4/t;", "fMessageItemConvert$delegate", "getFMessageItemConvert", "()Leg4/t;", "fMessageItemConvert", "Leg4/z;", "loadingItemConvert$delegate", "getLoadingItemConvert", "()Leg4/z;", "loadingItemConvert", "<init>", "(Lyz5/p;)V", "Companion", "eg4/a", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddFriendVerifyRecordConvertFactory implements in5.s {
    public static final int $stable = 8;
    public static final eg4.a Companion = new eg4.a(null);
    public static final java.lang.String TAG = "MicroMsg.ConvertFactory";

    /* renamed from: fMessageItemConvert$delegate, reason: from kotlin metadata */
    private final jz5.g fMessageItemConvert;

    /* renamed from: headerConvert$delegate, reason: from kotlin metadata */
    private final jz5.g headerConvert;

    /* renamed from: loadingItemConvert$delegate, reason: from kotlin metadata */
    private final jz5.g loadingItemConvert;

    /* renamed from: newItemConvert$delegate, reason: from kotlin metadata */
    private final jz5.g newItemConvert;
    private final yz5.p onItemLongClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public AddFriendVerifyRecordConvertFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final eg4.t getFMessageItemConvert() {
        return (eg4.t) this.fMessageItemConvert.getValue();
    }

    private final eg4.y getHeaderConvert() {
        return (eg4.y) this.headerConvert.getValue();
    }

    private final eg4.z getLoadingItemConvert() {
        return (eg4.z) this.loadingItemConvert.getValue();
    }

    private final eg4.i0 getNewItemConvert() {
        return (eg4.i0) this.newItemConvert.getValue();
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        eg4.f2 f2Var;
        eg4.f2.f252703e.getClass();
        eg4.f2[] values = eg4.f2.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                f2Var = null;
                break;
            }
            f2Var = values[i17];
            if (f2Var.f252706d == type) {
                break;
            }
            i17++;
        }
        if (f2Var == null) {
            f2Var = eg4.f2.f252704f;
        }
        int ordinal = f2Var.ordinal();
        if (ordinal == 0) {
            return getHeaderConvert();
        }
        if (ordinal == 1) {
            return getNewItemConvert();
        }
        if (ordinal == 2) {
            return getFMessageItemConvert();
        }
        if (ordinal == 3) {
            return getLoadingItemConvert();
        }
        throw new jz5.j();
    }

    public AddFriendVerifyRecordConvertFactory(yz5.p pVar) {
        this.onItemLongClickListener = pVar;
        this.headerConvert = jz5.h.b(eg4.c.f252680d);
        this.newItemConvert = jz5.h.b(new eg4.e(this));
        this.fMessageItemConvert = jz5.h.b(new eg4.b(this));
        this.loadingItemConvert = jz5.h.b(eg4.d.f252686d);
    }

    public /* synthetic */ AddFriendVerifyRecordConvertFactory(yz5.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : pVar);
    }
}
