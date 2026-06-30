package yh2;

/* loaded from: classes10.dex */
public final class i extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter implements yh2.m {
    public final java.util.ArrayList I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(in5.s itemConvertFactory, java.util.ArrayList userDataList) {
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
        boolean z17;
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = 0;
        for (in5.c cVar : this.I) {
            vi2.a aVar = cVar instanceof vi2.a ? (vi2.a) cVar : null;
            if (aVar != null) {
                km2.q qVar = aVar.f437552d;
                z17 = com.tencent.mm.sdk.platformtools.t8.D0(qVar != null ? qVar.f309172c : null, data.f309172c);
            } else {
                z17 = false;
            }
            if (z17) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
