package im2;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(im2.z3 z3Var) {
        super(0);
        this.f292254d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        im2.z3 z3Var = this.f292254d;
        if (z3Var.o7()) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(c01.id.c());
            calendar.set(5, calendar.get(5) + 8);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            com.tencent.mars.xlog.Log.i(z3Var.f292635d, "refreshInOneWeekTime: after one week, date=" + calendar.getTime() + ", timeInMills=" + calendar.getTimeInMillis());
            z3Var.M1 = (int) (calendar.getTimeInMillis() / ((long) 1000));
            z3Var.h7().setText(z3Var.getActivity().getResources().getString(com.tencent.mm.R.string.mq8, android.text.format.DateFormat.format(z3Var.getActivity().getResources().getString(com.tencent.mm.R.string.f492135fc2), calendar.getTimeInMillis())));
        }
        im2.z3.t7(this.f292254d, 1, 12, 0, null, null, 24, null);
        return jz5.f0.f302826a;
    }
}
