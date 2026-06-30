package yh2;

/* loaded from: classes10.dex */
public final class k extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter implements yh2.m {
    public final java.util.ArrayList I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(in5.s itemConvertFactory, java.util.ArrayList userDataList) {
        super(itemConvertFactory, userDataList, false);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(userDataList, "userDataList");
        this.I = userDataList;
    }

    @Override // yh2.m
    public java.util.ArrayList c() {
        return this.I;
    }

    @Override // yh2.m
    public void d(km2.q micUser) {
        kotlin.jvm.internal.o.g(micUser, "micUser");
        int j17 = j(micUser);
        if (j17 != -1) {
            this.I.remove(j17);
            notifyItemRemoved(j17);
        }
    }

    @Override // yh2.m
    public androidx.recyclerview.widget.f2 f() {
        return this;
    }

    @Override // yh2.m
    public int j(km2.q data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = this.I.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            km2.q qVar = ((vi2.i) it.next()).f437552d;
            if (com.tencent.mm.sdk.platformtools.t8.D0(qVar != null ? qVar.f309172c : null, data.f309172c)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
