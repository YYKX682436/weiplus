package hk5;

/* loaded from: classes9.dex */
public final class b extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new nb5.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0.C() == true) goto L10;
     */
    @Override // o50.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View U6(co.a r9) {
        /*
            r8 = this;
            nb5.a r9 = (nb5.a) r9
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.g(r9, r0)
            v05.b r0 = r9.j()
            if (r0 == 0) goto L21
            int r1 = r0.f432315e
            int r1 = r1 + 74
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            w05.h r0 = (w05.h) r0
            if (r0 == 0) goto L21
            boolean r0 = r0.C()
            r1 = 1
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L6e
            v05.b r9 = r9.j()
            if (r9 == 0) goto L35
            int r0 = r9.f432315e
            int r0 = r0 + 74
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r0)
            w05.h r9 = (w05.h) r9
            goto L36
        L35:
            r9 = 0
        L36:
            c11.a r0 = new c11.a
            r0.<init>()
            if (r9 == 0) goto L56
            java.lang.String r1 = r9.w()
            r0.f37802f = r1
            java.lang.String r1 = r9.s()
            r0.f37806m = r1
            java.lang.String r1 = r9.u()
            r0.f37808o = r1
            hk5.a r1 = new hk5.a
            r1.<init>(r9)
            r0.f37801e = r1
        L56:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingContactCardTemplateViewNew r9 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingContactCardTemplateViewNew
            androidx.appcompat.app.AppCompatActivity r3 = r8.getActivity()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r9.setViewModel(r0)
            r0 = 2131232280(0x7f080618, float:1.8080665E38)
            r9.setBackgroundResource(r0)
            goto L8f
        L6e:
            java.lang.Class<zn5.k> r0 = zn5.k.class
            i95.m r0 = i95.n0.c(r0)
            zn5.k r0 = (zn5.k) r0
            zn5.l r0 = (zn5.l) r0
            r0.Zi()
            io.b r0 = new io.b
            r0.<init>()
            nb5.a r1 = r0.f293167b
            r0.f293167b = r9
            r0.c(r1, r9)
            androidx.appcompat.app.AppCompatActivity r9 = r8.getActivity()
            android.view.View r9 = r0.a(r9)
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hk5.b.U6(co.a):android.view.View");
    }

    @Override // o50.j
    public void X6(android.view.View previewChattingView) {
        kotlin.jvm.internal.o.g(previewChattingView, "previewChattingView");
        if (previewChattingView instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingContactCardTemplateViewNew) {
            return;
        }
        super.X6(previewChattingView);
    }
}
