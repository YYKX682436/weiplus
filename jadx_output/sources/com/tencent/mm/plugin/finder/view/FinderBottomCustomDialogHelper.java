package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper;", "", "()V", "Companion", "UserInfoHelper", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinderBottomCustomDialogHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion INSTANCE = new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion(null);
    private static final java.lang.String TAG = "FinderBottomCustomDialogHelper";

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J@\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bJ*\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006JP\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tJ2\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tJ\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010J(\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u007f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010'J\u0089\u0001\u0010)\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u008b\u0001\u0010,\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion;", "", "Landroid/content/Context;", "context", "", "finderUserName", "Landroid/content/DialogInterface$OnClickListener;", "lok", "lcancel", "Landroid/content/DialogInterface$OnDismissListener;", "dismiss", "", "alwaysDarkMode", "Ljz5/f0;", "showUserInfoConfirmDialog", "showUserInfoConfirmDialogOnLiveRedPacket", "Landroid/app/Activity;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "Landroid/content/Intent;", "intent", "requestCode", "ldismiss", "showCreateFinderUserDialogOnLiveWithCallback", "showRealNameCertificationDialogWithCallback", "showCreateFinderUserDialog", "showRealNameCertificationDialog", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "content", "showOverSeaAgreeConfirmDiaglog", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "iconColor", "msg", "ok", "cancel", "btnStyle", "Lcom/tencent/mm/ui/widget/dialog/k0;", "showConfirmMsgDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)Lcom/tencent/mm/ui/widget/dialog/k0;", "Landroid/view/View;", "showConfirmDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;Z)Lcom/tencent/mm/ui/widget/dialog/k0;", "showFinderIcon", "showConfirmTextDialog", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/Boolean;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)Lcom/tencent/mm/ui/widget/dialog/k0;", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 showConfirmDialog$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.content.Context context, android.graphics.drawable.Drawable drawable, int i17, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, java.lang.Integer num, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, boolean z17, int i18, java.lang.Object obj) {
            return companion.showConfirmDialog(context, (i18 & 2) != 0 ? null : drawable, (i18 & 4) != 0 ? -1 : i17, str, view, str2, str3, (i18 & 128) != 0 ? 0 : num, onClickListener, (i18 & 512) != 0 ? null : onClickListener2, (i18 & 1024) != 0 ? null : onDismissListener, (i18 & 2048) != 0 ? false : z17);
        }

        public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 showConfirmMsgDialog$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.content.Context context, android.graphics.drawable.Drawable drawable, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, int i18, java.lang.Object obj) {
            return companion.showConfirmMsgDialog(context, (i18 & 2) != 0 ? null : drawable, (i18 & 4) != 0 ? -1 : i17, str, str2, str3, str4, (i18 & 128) != 0 ? 0 : num, onClickListener, (i18 & 512) != 0 ? null : onClickListener2, (i18 & 1024) != 0 ? null : onDismissListener);
        }

        public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 showConfirmTextDialog$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.content.Context context, android.graphics.drawable.Drawable drawable, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, android.content.DialogInterface.OnClickListener onClickListener, java.lang.Boolean bool, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, int i18, java.lang.Object obj) {
            return companion.showConfirmTextDialog(context, (i18 & 2) != 0 ? null : drawable, (i18 & 4) != 0 ? -1 : i17, str, str2, str3, str4, (i18 & 128) != 0 ? 0 : num, onClickListener, (i18 & 512) != 0 ? java.lang.Boolean.TRUE : bool, (i18 & 1024) != 0 ? null : onClickListener2, (i18 & 2048) != 0 ? null : onDismissListener);
        }

        public static /* synthetic */ void showCreateFinderUserDialog$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.content.Context context, int i17, android.content.Intent intent, int i18, java.lang.Object obj) {
            if ((i18 & 4) != 0) {
                intent = null;
            }
            companion.showCreateFinderUserDialog(context, i17, intent);
        }

        public static /* synthetic */ void showRealNameCertificationDialogWithCallback$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.app.Activity activity, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, int i17, java.lang.Object obj) {
            if ((i17 & 2) != 0) {
                onClickListener = null;
            }
            if ((i17 & 4) != 0) {
                onClickListener2 = null;
            }
            if ((i17 & 8) != 0) {
                onDismissListener = null;
            }
            companion.showRealNameCertificationDialogWithCallback(activity, onClickListener, onClickListener2, onDismissListener);
        }

        public static /* synthetic */ void showUserInfoConfirmDialog$default(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion, android.content.Context context, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, boolean z17, int i17, java.lang.Object obj) {
            if ((i17 & 16) != 0) {
                onDismissListener = null;
            }
            android.content.DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
            if ((i17 & 32) != 0) {
                z17 = false;
            }
            companion.showUserInfoConfirmDialog(context, str, onClickListener, onClickListener2, onDismissListener2, z17);
        }

        public final com.tencent.mm.ui.widget.dialog.k0 showConfirmDialog(android.content.Context context, android.graphics.drawable.Drawable iconDrawable, int iconColor, java.lang.String r132, android.view.View content, java.lang.String ok6, java.lang.String cancel, java.lang.Integer btnStyle, final android.content.DialogInterface.OnClickListener lok, final android.content.DialogInterface.OnClickListener lcancel, final android.content.DialogInterface.OnDismissListener ldismiss, boolean alwaysDarkMode) {
            final com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(content, "content");
            final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            k0Var.t(alwaysDarkMode);
            if (alwaysDarkMode) {
                android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aem, null);
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
                roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            } else {
                android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.ael, null);
                kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
                roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate2;
            }
            ((android.widget.FrameLayout) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4)).addView(content);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ehp);
            if (iconDrawable != null) {
                weImageView.setImageDrawable(iconDrawable);
            } else {
                weImageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_finder_icon));
            }
            if (iconColor != -1) {
                weImageView.setIconColor(iconColor);
            } else {
                weImageView.setIconColor(i65.a.d(context, com.tencent.mm.R.color.f478526a7));
            }
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(r132)) {
                textView.setText(r132);
            }
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ok6)) {
                button.setText(ok6);
            }
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cancel)) {
                button2.setText(cancel);
            }
            kotlin.jvm.internal.o.d(button);
            com.tencent.mm.ui.fk.a(button);
            kotlin.jvm.internal.o.d(button2);
            com.tencent.mm.ui.fk.a(button2);
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    android.content.DialogInterface.OnClickListener onClickListener = lok;
                    if (onClickListener != null) {
                        onClickListener.onClick(null, -1);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$2
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    android.content.DialogInterface.OnClickListener onClickListener = lcancel;
                    if (onClickListener != null) {
                        onClickListener.onClick(null, -2);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            k0Var.f211854d = new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$3
                @Override // com.tencent.mm.ui.widget.dialog.c1
                public final void onDismiss() {
                    android.content.DialogInterface.OnDismissListener onDismissListener = ldismiss;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(null);
                    }
                }
            };
            k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$4
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    com.tencent.mm.ui.widget.dialog.k0.this.o(null);
                    com.tencent.mm.ui.widget.dialog.k0.this.o(roundedCornerFrameLayout);
                }
            };
            if (btnStyle != null && btnStyle.intValue() == 1) {
                button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479552ab3));
                button.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a7_));
            }
            k0Var.e(true);
            k0Var.v();
            return k0Var;
        }

        public final com.tencent.mm.ui.widget.dialog.k0 showConfirmMsgDialog(android.content.Context context, android.graphics.drawable.Drawable iconDrawable, int iconColor, java.lang.String r19, java.lang.String msg, java.lang.String ok6, java.lang.String cancel, java.lang.Integer btnStyle, android.content.DialogInterface.OnClickListener lok, android.content.DialogInterface.OnClickListener lcancel, android.content.DialogInterface.OnDismissListener ldismiss) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(msg, "msg");
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aei, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484880ft3);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            textView.setText(msg);
            return showConfirmDialog$default(this, context, iconDrawable, iconColor, r19, inflate, ok6, cancel, btnStyle, lok, lcancel, ldismiss, false, 2048, null);
        }

        public final com.tencent.mm.ui.widget.dialog.k0 showConfirmTextDialog(android.content.Context context, android.graphics.drawable.Drawable iconDrawable, int iconColor, java.lang.String r132, java.lang.String content, java.lang.String ok6, java.lang.String cancel, java.lang.Integer btnStyle, final android.content.DialogInterface.OnClickListener lok, java.lang.Boolean showFinderIcon, final android.content.DialogInterface.OnClickListener lcancel, final android.content.DialogInterface.OnDismissListener ldismiss) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(content, "content");
            final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aen, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            final com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            ((android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4)).setText(content);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ehp);
            if (iconDrawable != null) {
                weImageView.setImageDrawable(iconDrawable);
            } else {
                weImageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_finder_icon));
            }
            if (iconColor != -1) {
                weImageView.setIconColor(iconColor);
            } else {
                weImageView.setIconColor(i65.a.d(context, com.tencent.mm.R.color.f478526a7));
            }
            if (kotlin.jvm.internal.o.b(showFinderIcon, java.lang.Boolean.TRUE)) {
                weImageView.setVisibility(0);
            } else {
                weImageView.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(r132)) {
                textView.setText(r132);
            }
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ok6)) {
                button.setText(ok6);
            }
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cancel)) {
                button2.setText(cancel);
            }
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$1
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    android.content.DialogInterface.OnClickListener onClickListener = lok;
                    if (onClickListener != null) {
                        onClickListener.onClick(null, -1);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$2
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    android.content.DialogInterface.OnClickListener onClickListener = lcancel;
                    if (onClickListener != null) {
                        onClickListener.onClick(null, -2);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            k0Var.f211854d = new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$3
                @Override // com.tencent.mm.ui.widget.dialog.c1
                public final void onDismiss() {
                    android.content.DialogInterface.OnDismissListener onDismissListener = ldismiss;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(null);
                    }
                }
            };
            k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$4
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    com.tencent.mm.ui.widget.dialog.k0.this.o(null);
                    com.tencent.mm.ui.widget.dialog.k0.this.o(roundedCornerFrameLayout);
                }
            };
            if (btnStyle != null && btnStyle.intValue() == 1) {
                button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479552ab3));
                button.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a7_));
                button2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a3c));
            }
            k0Var.e(true);
            k0Var.v();
            return k0Var;
        }

        public final void showCreateFinderUserDialog(final android.content.Context context, final int i17, final android.content.Intent intent) {
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String string = context.getString(com.tencent.mm.R.string.f491331cs1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.cry);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f491330cs0);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.crx);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            showConfirmMsgDialog$default(this, context, null, 0, string, string2, string3, string4, null, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showCreateFinderUserDialog$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    android.content.Intent intent2 = intent;
                    if (intent2 == null) {
                        intent2 = new android.content.Intent();
                    }
                    intent2.putExtra("key_create_scene", i17);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(context, intent2);
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Kj(ml2.l3.f327696g);
                }
            }, null, new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showCreateFinderUserDialog$2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Kj(ml2.l3.f327695f);
                }
            }, xc1.l.CTRL_INDEX, null);
        }

        public final void showCreateFinderUserDialogOnLiveWithCallback(final android.app.Activity context, final int i17, final android.content.Intent intent, final int i18, final android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener) {
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String string = context.getString(com.tencent.mm.R.string.csj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.cru);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.d0h);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.crx);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            showConfirmMsgDialog$default(this, context, null, 0, string, string2, string3, string4, 1, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showCreateFinderUserDialogOnLiveWithCallback$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    android.content.Intent intent2 = intent;
                    if (intent2 == null) {
                        intent2 = new android.content.Intent();
                    }
                    intent2.putExtra("key_create_scene", i17);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rj(context, intent2, i18);
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(dialogInterface, i19);
                    }
                }
            }, onClickListener2, onDismissListener, 6, null);
        }

        public final void showOverSeaAgreeConfirmDiaglog(android.content.Context context, java.lang.String title, java.lang.String content, final android.content.DialogInterface.OnClickListener onClickListener) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(title, "title");
            kotlin.jvm.internal.o.g(content, "content");
            final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aeo, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            final com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            ((android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e)).setText(title);
            ((android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4)).setText(content);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.prm);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.pri);
            java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                obj = com.tencent.mm.sdk.platformtools.m2.e();
            }
            java.lang.String str = (com.tencent.mm.sdk.platformtools.t8.K0(obj) || com.tencent.mm.sdk.platformtools.t8.x0(obj)) ? obj : "";
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), str, "setting", 0, 0);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.k4f, com.tencent.mm.sdk.platformtools.m2.d(), str);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format("<a href='%s'>%s</a>", java.util.Arrays.copyOf(new java.lang.Object[]{string2, context.getResources().getString(com.tencent.mm.R.string.gb8)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
            java.lang.String format2 = java.lang.String.format("<a href='%s'>%s</a>", java.util.Arrays.copyOf(new java.lang.Object[]{string, context.getResources().getString(com.tencent.mm.R.string.hln)}, 2));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            textView2.setText(format2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView2, 1);
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$1
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    android.content.DialogInterface.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(null, -1);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$2
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.ui.widget.dialog.k0.this.u();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showOverSeaAgreeConfirmDiaglog$3
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    com.tencent.mm.ui.widget.dialog.k0.this.o(null);
                    com.tencent.mm.ui.widget.dialog.k0.this.o(roundedCornerFrameLayout);
                }
            };
            k0Var.e(true);
            k0Var.v();
        }

        public final void showRealNameCertificationDialog(final android.app.Activity context) {
            kotlin.jvm.internal.o.g(context, "context");
            android.graphics.drawable.Drawable i17 = i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_wechat);
            int d17 = i65.a.d(context, com.tencent.mm.R.color.a9e);
            java.lang.String string = context.getString(com.tencent.mm.R.string.f492042f15);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f0x);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f0y);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.f0w);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            showConfirmMsgDialog$default(this, context, i17, d17, string, string2, string3, string4, null, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showRealNameCertificationDialog$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(context, null);
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Kj(ml2.l3.f327696g);
                }
            }, null, new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showRealNameCertificationDialog$2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Kj(ml2.l3.f327695f);
                }
            }, 640, null);
        }

        public final void showRealNameCertificationDialogWithCallback(final android.app.Activity context, final android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener) {
            kotlin.jvm.internal.o.g(context, "context");
            android.graphics.drawable.Drawable i17 = i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_finder_icon);
            int d17 = i65.a.d(context, com.tencent.mm.R.color.f478526a7);
            java.lang.String string = context.getString(com.tencent.mm.R.string.csj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.cre);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f0y);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.f0w);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            showConfirmMsgDialog(context, i17, d17, string, string2, string3, string4, 1, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showRealNameCertificationDialogWithCallback$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(context, null);
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(dialogInterface, i18);
                    }
                }
            }, onClickListener2, onDismissListener);
        }

        public final void showUserInfoConfirmDialog(android.content.Context context, java.lang.String finderUserName, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, boolean z17) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
            java.lang.String string = context.getString(com.tencent.mm.R.string.f9m);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f9o);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f9l);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.view.View inflate = z17 ? android.view.View.inflate(context, com.tencent.mm.R.layout.aek, null) : android.view.View.inflate(context, com.tencent.mm.R.layout.aej, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper(context, finderUserName, (android.view.ViewGroup) inflate).load(new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialog$1$1(context, string, inflate, string2, string3, onClickListener, onClickListener2, z17, onDismissListener));
        }

        public final void showUserInfoConfirmDialogOnLiveRedPacket(android.content.Context context, java.lang.String finderUserName, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
            java.lang.String string = context.getString(com.tencent.mm.R.string.f9m);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f9o);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f9l);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aej, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper(context, finderUserName, (android.view.ViewGroup) inflate).load(new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1(context, string, inflate, string2, string3, onClickListener, onClickListener2));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u001a\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$UserInfoHelper;", "", "", dm.i4.COL_USERNAME, "Ljz5/f0;", "doSceneForUserInfo", "loadInternal", "Lya2/b2;", "finderContact", "Landroid/view/ViewGroup;", "userInfoContainer", "handleNickname", "handleAuth", "locationText", "", "getLocationTextWidth", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "", "availableWidth", "nameExtWidth", "setProfileTextWidth", "getChangeLeftRegionWidth", "getTotalAvailableWidth", "Lcom/tencent/mm/plugin/finder/profile/uic/l2;", "userExtInfo", "getUserTagText", "Lkotlin/Function1;", "", "callback", "load", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "Lcom/tencent/mm/ui/widget/dialog/u3;", "loadingDialog", "Lcom/tencent/mm/ui/widget/dialog/u3;", "Lwu5/c;", "dialogRunnable", "Lwu5/c;", "Lyz5/l;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/view/ViewGroup;)V", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class UserInfoHelper {
        public static final java.lang.String TAG = "ProfileHeaderHelper";
        private yz5.l callback;
        private final android.content.Context context;
        private wu5.c dialogRunnable;
        private com.tencent.mm.ui.widget.dialog.u3 loadingDialog;
        private final android.view.ViewGroup userInfoContainer;
        private final java.lang.String username;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.Companion INSTANCE = new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.Companion(null);
        private static final kk.l userExtInfoCache = new kk.l(100);

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$UserInfoHelper$Companion;", "", "Lkk/l;", "", "Lcom/tencent/mm/plugin/finder/profile/uic/l2;", "userExtInfoCache", "Lkk/l;", "getUserExtInfoCache", "()Lkk/l;", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final kk.l getUserExtInfoCache() {
                return com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.userExtInfoCache;
            }
        }

        public UserInfoHelper(android.content.Context context, java.lang.String username, android.view.ViewGroup userInfoContainer) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(username, "username");
            kotlin.jvm.internal.o.g(userInfoContainer, "userInfoContainer");
            this.context = context;
            this.username = username;
            this.userInfoContainer = userInfoContainer;
            this.callback = com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$callback$1.INSTANCE;
        }

        private final void doSceneForUserInfo(java.lang.String str) {
            com.tencent.mars.xlog.Log.i(TAG, "doSceneForUserInfo, username:" + str);
            wu5.c cVar = this.dialogRunnable;
            if (cVar != null) {
                cVar.cancel(false);
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper = com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.this;
                    userInfoHelper.loadingDialog = com.tencent.mm.ui.widget.dialog.u3.f(userInfoHelper.getContext(), com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.this.getContext().getString(com.tencent.mm.R.string.ggd), true, 3, null);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            this.dialogRunnable = t0Var.z(runnable, 1500L, false);
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1 finderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1 = new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1(this);
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.j1.n((cq.k) c17, str, 0L, null, 0, null, 0, 0L, true, null, 0L, null, null, null, false, false, null, false, null, null, null, null, new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2(finderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1, str, this), new com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$3(finderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1, this), 2097006, null);
        }

        private final float getChangeLeftRegionWidth(java.lang.String r37) {
            if (this.userInfoContainer.findViewById(com.tencent.mm.R.id.fxd).getVisibility() == 0) {
                return 0.0f + i65.a.f(this.userInfoContainer.getContext(), com.tencent.mm.R.dimen.f479693cs);
            }
            return 0.0f;
        }

        private final float getLocationTextWidth(java.lang.String locationText) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(locationText)) {
                return 0.0f;
            }
            return ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.ov9)).getPaint().measureText(locationText);
        }

        private final int getTotalAvailableWidth() {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.content.Context context = this.userInfoContainer.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            com.tencent.mars.xlog.Log.i(TAG, "screen width :" + displayMetrics.widthPixels);
            return displayMetrics.widthPixels - i65.a.f(this.userInfoContainer.getContext(), com.tencent.mm.R.dimen.f480426xl);
        }

        private final java.lang.String getUserTagText(com.tencent.mm.plugin.finder.profile.uic.l2 userExtInfo) {
            java.util.LinkedList linkedList = userExtInfo.f123915d;
            if (linkedList.isEmpty()) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(" ");
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.context;
            java.lang.String sb7 = sb6.toString();
            ((ke0.e) xVar).getClass();
            java.lang.String spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb7).toString();
            kotlin.jvm.internal.o.f(spannableString, "toString(...)");
            return spannableString;
        }

        private final void handleAuth(ya2.b2 b2Var) {
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
            r45.xk b17;
            if (b2Var == null || (b17 = ya2.d.b(b2Var, false)) == null || (finderAuthInfo = ya2.d.e(b17)) == null) {
                finderAuthInfo = b2Var != null ? b2Var.field_authInfo : null;
            }
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = finderAuthInfo;
            if (finderAuthInfo2 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleAuthGenerator] profileContact=");
                sb6.append(b2Var != null);
                com.tencent.mars.xlog.Log.w("Finder.FinderProfileHeaderUIC", sb6.toString());
            } else {
                if (finderAuthInfo2.getAuthIconType() <= 0) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderProfileHeaderUIC", "[handleAuthGenerator] authIconType<=0");
                    return;
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.m1 m1Var = ya2.m1.f460511a;
                android.view.View findViewById = this.userInfoContainer.findViewById(com.tencent.mm.R.id.fxd);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                zy2.tb.a(m1Var, (android.widget.ImageView) findViewById, finderAuthInfo2, 0, 4, null);
            }
        }

        private final void handleNickname(ya2.b2 b2Var, android.view.ViewGroup viewGroup) {
            if (b2Var == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.findViewById(com.tencent.mm.R.id.fzm).getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ov9);
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.fzn);
            android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.fxe);
            if (textView.getVisibility() == 4) {
                layoutParams2.f10897j = -1;
                layoutParams2.f10893h = com.tencent.mm.R.id.fxf;
                layoutParams2.f10899k = com.tencent.mm.R.id.fxf;
            } else {
                layoutParams2.f10897j = com.tencent.mm.R.id.fxg;
                layoutParams2.f10893h = -1;
                layoutParams2.f10899k = -1;
            }
            viewGroup.findViewById(com.tencent.mm.R.id.fzm).setLayoutParams(layoutParams2);
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b2Var.field_avatarUrl, null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        }

        public final void loadInternal() {
            java.lang.Object obj = userExtInfoCache.get(this.username);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.String userTagText = getUserTagText((com.tencent.mm.plugin.finder.profile.uic.l2) obj);
            ya2.b2 b17 = ya2.h.f460484a.b(this.username);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.context;
            java.lang.String w07 = b17 != null ? b17.w0() : null;
            ((ke0.e) xVar).getClass();
            java.lang.String spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07).toString();
            kotlin.jvm.internal.o.f(spannableString, "toString(...)");
            int totalAvailableWidth = getTotalAvailableWidth();
            float changeLeftRegionWidth = getChangeLeftRegionWidth(spannableString);
            float measureText = ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.fzn)).getPaint().measureText(spannableString);
            float locationTextWidth = getLocationTextWidth(userTagText);
            float f17 = totalAvailableWidth;
            if (measureText + changeLeftRegionWidth > f17 || locationTextWidth > f17) {
                setProfileTextWidth(spannableString, userTagText, totalAvailableWidth - i65.a.f(this.userInfoContainer.getContext(), com.tencent.mm.R.dimen.f479688cn), (int) changeLeftRegionWidth);
            } else {
                setProfileTextWidth(spannableString, userTagText, totalAvailableWidth, (int) changeLeftRegionWidth);
            }
            handleNickname(b17, this.userInfoContainer);
            handleAuth(b17);
            this.callback.invoke(java.lang.Boolean.TRUE);
        }

        private final void setProfileTextWidth(java.lang.String str, java.lang.String str2, int i17, int i18) {
            ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.fzn)).setMaxWidth(i17 - i18);
            ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.fzn)).setText(str);
            ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.ov9)).setMaxWidth(i17);
            ((android.widget.TextView) this.userInfoContainer.findViewById(com.tencent.mm.R.id.ov9)).setText(str2);
        }

        public final android.content.Context getContext() {
            return this.context;
        }

        public final java.lang.String getUsername() {
            return this.username;
        }

        public final void load(yz5.l callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            this.callback = callback;
            if (userExtInfoCache.k(this.username)) {
                loadInternal();
            } else {
                doSceneForUserInfo(this.username);
            }
        }
    }
}
