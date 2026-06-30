package rt1;

/* loaded from: classes3.dex */
public final class t0 extends androidx.recyclerview.widget.z {
    public t0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI) {
    }

    @Override // androidx.recyclerview.widget.o3, androidx.recyclerview.widget.n2
    public boolean b(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, androidx.recyclerview.widget.m2 preInfo, androidx.recyclerview.widget.m2 postInfo) {
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        kotlin.jvm.internal.o.g(preInfo, "preInfo");
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        j(oldHolder);
        h(oldHolder);
        j(newHolder);
        h(newHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public boolean g(androidx.recyclerview.widget.k3 viewHolder, java.util.List payloads) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        return (viewHolder instanceof rt1.u0) || super.g(viewHolder, payloads);
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof rt1.u0) {
            super.t(holder);
            return true;
        }
        j(holder);
        h(holder);
        return false;
    }
}
