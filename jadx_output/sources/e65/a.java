package e65;

/* loaded from: classes.dex */
public abstract class a extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_".concat(getClass().getName());
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupTextStatus.class;
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("默认", "强制打开", "强制关闭");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2");
    }
}
