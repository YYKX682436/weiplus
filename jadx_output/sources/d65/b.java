package d65;

/* loaded from: classes.dex */
public abstract class b extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_".concat(getClass().getName());
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.textstatus.multiple.RepairerGroupTextStatusMultipleTest.class;
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("默认(x实验)", "默认", "强制使用", "强制不使用");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "0", "2", "3");
    }
}
