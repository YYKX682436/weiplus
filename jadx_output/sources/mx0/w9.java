package mx0;

/* loaded from: classes5.dex */
public final class w9 extends mx0.t9 {
    @Override // mx0.t9
    public java.lang.String B(int i17) {
        java.util.ArrayList arrayList = this.f332358f;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f440020b;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.e("ShootComposingParticipateTemplateAdapter", "invalid position: " + i17);
        return null;
    }

    @Override // mx0.t9
    public boolean E(int i17) {
        java.util.ArrayList arrayList = this.f332358f;
        if (i17 >= 0 && i17 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f440031m;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("ShootComposingParticipateTemplateAdapter", "getTemplateIsAIGC - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public boolean I(int i17) {
        java.util.ArrayList arrayList = this.f332358f;
        if (i17 >= 0 && i17 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f440027i;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("ShootComposingParticipateTemplateAdapter", "getTemplateIsFavorite - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public com.tencent.mm.protobuf.g J(int i17) {
        java.util.ArrayList arrayList = this.f332358f;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f440026h;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.e("ShootComposingParticipateTemplateAdapter", "invalid position: " + i17);
        return null;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f332358f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        mx0.ba holder = (mx0.ba) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        x(i17, holder);
    }

    @Override // mx0.t9
    public int y(int i17) {
        return i17;
    }

    @Override // mx0.t9
    public int z(int i17) {
        return i17;
    }
}
